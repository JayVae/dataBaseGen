package com.xiaotang.datagen.entity.merchant;

public class PropertyManager {
    private String managerId;

    private String propertyuserid;

    private String accountId;

    private String managerName;

    private String managerPost;

    private String managerPhone;

    public String getmanagerPhone(){return managerPhone;}

    public void setmanagerPhone(String managerPhone) { this.managerPhone = managerPhone == null ? null : managerPhone.trim();}

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
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

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getManagerPost() {
        return managerPost;
    }

    public void setManagerPost(String managerPost) {
        this.managerPost = managerPost == null ? null : managerPost.trim();
    }


}