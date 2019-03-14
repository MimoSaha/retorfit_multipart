
package com.android.retrofitmultipart.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageUpload {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("uploadedImages")
    @Expose
    private List<UploadedImage> uploadedImages = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<UploadedImage> getUploadedImages() {
        return uploadedImages;
    }

    public void setUploadedImages(List<UploadedImage> uploadedImages) {
        this.uploadedImages = uploadedImages;
    }

}
