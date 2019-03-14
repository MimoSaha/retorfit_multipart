package com.android.retrofitmultipart;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.android.retrofitmultipart.model.ImageUpload;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private String xAccessToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6InNoYWRtYW51bCIsImlhdCI6MTU1MjI4NDI2MiwiZXhwIjoxNTUyODg5MDYyfQ.XN5DIiAjanjeRebtt9Pv8VqCrWZirs0lhxq_TF5lFjo";

    private int BROWSE_KEY = 1022;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton browseFile = findViewById(R.id.browse_file);
        browseFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uploadServer();
            }
        });
    }

    private void uploadToServer(String filePath) {
        Retrofit retrofit = NetworkClient.getRetrofitClient(this);
        UploadAPIs uploadAPIs = retrofit.create(UploadAPIs.class);
        //Create a file object using file path
        File file = new File(filePath);
        // Create a request body with file and image media type
        RequestBody fileReqBody = RequestBody.create(MediaType.parse("image/*"), file);
        // Create MultipartBody.Part using file request-body,file name and part name
        MultipartBody.Part part = MultipartBody.Part.createFormData("upload", file.getName(), fileReqBody);
        //Create request body with text description and text media type
        RequestBody description = RequestBody.create(MediaType.parse("text/plain"), "image-type");
        //
        Call call = uploadAPIs.uploadImage(part, description);
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
            }
            @Override
            public void onFailure(Call call, Throwable t) {
            }
        });
    }

    private void uploadServer() {

        String filePath = "/storage/emulated/0/DCIM/Camera/IMG_20190311_193204.jpg";

        Retrofit retrofit = NetworkClient.getRetrofitClient(this);
        UploadAPIs uploadAPIs = retrofit.create(UploadAPIs.class);

        File file = new File(filePath);
        RequestBody fileReqBody = RequestBody.create(MediaType.parse("image/*"), file);

        MultipartBody.Part part = MultipartBody.Part.createFormData("upload", file.getName(), fileReqBody);

        String info = "{\"user\": \"kotha-messaging\", \"files\": [{\"name\": \"IMG_20190311_193204.jpg\", \"title\": \"apple\", \"id\": \"1\", \"description\": \"apple logo\", \"width\": 320, \"height\": 320}]}";
        //
        Call call = uploadAPIs.uploadFile(xAccessToken, info, part);


        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                ImageUpload imageUpload = (ImageUpload) response.body();
                Log.v("MIMO_SAHA::", "Response: " + imageUpload);
            }
            @Override
            public void onFailure(Call call, Throwable t) {
                Log.v("MIMO_SAHA::", "Throwable: " + t.getMessage());
            }
        });
    }

    private void browseFile() {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, BROWSE_KEY);
    }

    String contentPath;

    public void onActivityResult(int requestCode, int resultCode,
                                 Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == BROWSE_KEY && data != null) {
            Uri currFileURI = data.getData();
            if (currFileURI != null) {
                contentPath = getPath(currFileURI);

                Log.v("MIMO_SAHA::", "Path: " + contentPath);
            }
        }
    }

    public String getPath(Uri uri) {

        String path = null;
        String[] projection = {MediaStore.Files.FileColumns.DATA};
        Cursor cursor = getContentResolver().query(uri, projection,
                null, null, null);

        if (cursor == null) {
            path = uri.getPath();
        } else {
            cursor.moveToFirst();
            int column_index = cursor.getColumnIndexOrThrow(projection[0]);
            path = cursor.getString(column_index);
            cursor.close();
        }

        return ((path == null || path.isEmpty()) ? (uri.getPath()) : path);
    }

}
