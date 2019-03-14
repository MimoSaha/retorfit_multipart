
package com.android.retrofitmultipart.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UploadedImage {

    @SerializedName("originalVersion")
    @Expose
    private OriginalVersion originalVersion;
    @SerializedName("desktopVersion")
    @Expose
    private DesktopVersion desktopVersion;
    @SerializedName("tabVersion")
    @Expose
    private TabVersion tabVersion;
    @SerializedName("mobileVersion")
    @Expose
    private MobileVersion mobileVersion;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;

    public OriginalVersion getOriginalVersion() {
        return originalVersion;
    }

    public void setOriginalVersion(OriginalVersion originalVersion) {
        this.originalVersion = originalVersion;
    }

    public DesktopVersion getDesktopVersion() {
        return desktopVersion;
    }

    public void setDesktopVersion(DesktopVersion desktopVersion) {
        this.desktopVersion = desktopVersion;
    }

    public TabVersion getTabVersion() {
        return tabVersion;
    }

    public void setTabVersion(TabVersion tabVersion) {
        this.tabVersion = tabVersion;
    }

    public MobileVersion getMobileVersion() {
        return mobileVersion;
    }

    public void setMobileVersion(MobileVersion mobileVersion) {
        this.mobileVersion = mobileVersion;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

}
