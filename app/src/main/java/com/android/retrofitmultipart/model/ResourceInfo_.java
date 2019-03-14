
package com.android.retrofitmultipart.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResourceInfo_ {

    @SerializedName("resourceName")
    @Expose
    private String resourceName;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("resolutionTypeId")
    @Expose
    private Integer resolutionTypeId;
    @SerializedName("fileTypeId")
    @Expose
    private Integer fileTypeId;
    @SerializedName("privacyId")
    @Expose
    private Integer privacyId;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("sizeInBytes")
    @Expose
    private Integer sizeInBytes;
    @SerializedName("originalLocation")
    @Expose
    private String originalLocation;
    @SerializedName("localAccessLocation")
    @Expose
    private String localAccessLocation;
    @SerializedName("globalAccessLocation")
    @Expose
    private String globalAccessLocation;
    @SerializedName("previewLocation")
    @Expose
    private String previewLocation;
    @SerializedName("posterLocation")
    @Expose
    private String posterLocation;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getResolutionTypeId() {
        return resolutionTypeId;
    }

    public void setResolutionTypeId(Integer resolutionTypeId) {
        this.resolutionTypeId = resolutionTypeId;
    }

    public Integer getFileTypeId() {
        return fileTypeId;
    }

    public void setFileTypeId(Integer fileTypeId) {
        this.fileTypeId = fileTypeId;
    }

    public Integer getPrivacyId() {
        return privacyId;
    }

    public void setPrivacyId(Integer privacyId) {
        this.privacyId = privacyId;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Integer sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public String getOriginalLocation() {
        return originalLocation;
    }

    public void setOriginalLocation(String originalLocation) {
        this.originalLocation = originalLocation;
    }

    public String getLocalAccessLocation() {
        return localAccessLocation;
    }

    public void setLocalAccessLocation(String localAccessLocation) {
        this.localAccessLocation = localAccessLocation;
    }

    public String getGlobalAccessLocation() {
        return globalAccessLocation;
    }

    public void setGlobalAccessLocation(String globalAccessLocation) {
        this.globalAccessLocation = globalAccessLocation;
    }

    public String getPreviewLocation() {
        return previewLocation;
    }

    public void setPreviewLocation(String previewLocation) {
        this.previewLocation = previewLocation;
    }

    public String getPosterLocation() {
        return posterLocation;
    }

    public void setPosterLocation(String posterLocation) {
        this.posterLocation = posterLocation;
    }

}
