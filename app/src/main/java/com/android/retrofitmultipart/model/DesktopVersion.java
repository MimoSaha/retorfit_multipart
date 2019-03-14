
package com.android.retrofitmultipart.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DesktopVersion {

    @SerializedName("resourceId")
    @Expose
    private String resourceId;
    @SerializedName("resourceTypeId")
    @Expose
    private Integer resourceTypeId;
    @SerializedName("masterResourceId")
    @Expose
    private String masterResourceId;
    @SerializedName("ownerId")
    @Expose
    private String ownerId;
    @SerializedName("channelId")
    @Expose
    private String channelId;
    @SerializedName("privacyId")
    @Expose
    private Integer privacyId;
    @SerializedName("resourceInfo")
    @Expose
    private ResourceInfo resourceInfo;
    @SerializedName("requestCount")
    @Expose
    private Integer requestCount;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @SerializedName("isDeleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("isSuspended")
    @Expose
    private Boolean isSuspended;
    @SerializedName("isHiddenFromVOD")
    @Expose
    private Boolean isHiddenFromVOD;
    @SerializedName("processStatus")
    @Expose
    private Integer processStatus;
    @SerializedName("createDate")
    @Expose
    private String createDate;
    @SerializedName("lastUpdateDate")
    @Expose
    private String lastUpdateDate;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("lastUpdateBy")
    @Expose
    private String lastUpdateBy;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getResourceTypeId() {
        return resourceTypeId;
    }

    public void setResourceTypeId(Integer resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    public String getMasterResourceId() {
        return masterResourceId;
    }

    public void setMasterResourceId(String masterResourceId) {
        this.masterResourceId = masterResourceId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Integer getPrivacyId() {
        return privacyId;
    }

    public void setPrivacyId(Integer privacyId) {
        this.privacyId = privacyId;
    }

    public ResourceInfo getResourceInfo() {
        return resourceInfo;
    }

    public void setResourceInfo(ResourceInfo resourceInfo) {
        this.resourceInfo = resourceInfo;
    }

    public Integer getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsSuspended() {
        return isSuspended;
    }

    public void setIsSuspended(Boolean isSuspended) {
        this.isSuspended = isSuspended;
    }

    public Boolean getIsHiddenFromVOD() {
        return isHiddenFromVOD;
    }

    public void setIsHiddenFromVOD(Boolean isHiddenFromVOD) {
        this.isHiddenFromVOD = isHiddenFromVOD;
    }

    public Integer getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

}
