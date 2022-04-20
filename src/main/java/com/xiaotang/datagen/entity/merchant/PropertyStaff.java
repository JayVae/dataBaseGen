package com.xiaotang.datagen.entity.merchant;

public class PropertyStaff {
    private String staffId;

    private String propertyuserid;

    private String accountId;

    private String staffName;

    private String staffPost;

    private String staffPhone;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getPropertyuserid() {
        return propertyuserid;
    }

    public void setPropertyuserid(String propertyuserid) {
        this.propertyuserid = propertyuserid == null ? null : propertyuserid.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffPost() {
        return staffPost;
    }

    public void setStaffPost(String staffPost) {
        this.staffPost = staffPost == null ? null : staffPost.trim();
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone == null ? null : staffPhone.trim();
    }
}