package com.xiaotang.datagen.entity.sys;

public class AuthorityManagement {
    private String authorityManagementId;

    private String url;

    private Integer role;

    private String urlName;

    public String getAuthorityManagementId() {
        return authorityManagementId;
    }

    public void setAuthorityManagementId(String authorityManagementId) {
        this.authorityManagementId = authorityManagementId == null ? null : authorityManagementId.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName == null ? null : urlName.trim();
    }
}