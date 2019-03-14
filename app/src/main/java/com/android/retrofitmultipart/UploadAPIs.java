package com.android.retrofitmultipart;

import com.android.retrofitmultipart.model.ImageUpload;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * ============================================================================
 * Copyright (C) 2019 W3 Engineers Ltd. - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Created by: Mimo Saha on [14-Mar-2019 at 2:56 PM].
 * Email:
 * Project: RetrofitMultipart.
 * Code Responsibility: <Purpose of code>
 * Edited by :
 * --> <First Editor> on [14-Mar-2019 at 2:56 PM].
 * --> <Second Editor> on [14-Mar-2019 at 2:56 PM].
 * Reviewed by :
 * --> <First Reviewer> on [14-Mar-2019 at 2:56 PM].
 * --> <Second Reviewer> on [14-Mar-2019 at 2:56 PM].
 * ============================================================================
 **/
public interface UploadAPIs {

    @Multipart
    @POST("/upload")
    Call<ResponseBody> uploadImage(@Part MultipartBody.Part file, @Part("name") RequestBody requestBody);

    @Multipart
    @POST("/image/upload")
    Call<ImageUpload> uploadFile(@Header("x-access-token") String accessToken,
                                 @Header("info") String info,
                                 @Part MultipartBody.Part file);

}
