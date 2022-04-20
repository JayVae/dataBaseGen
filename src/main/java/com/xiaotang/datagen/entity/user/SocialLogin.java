package com.xiaotang.datagen.entity.user;

public class SocialLogin {
    private String socialLoginId;

    private String accountId;

    private String openId;
    /**
     * 1微信平台
     */
    private Integer type;

    public String getSocialLoginId() {
        return socialLoginId;
    }

    public void setSocialLoginId(String socialLoginId) {
        this.socialLoginId = socialLoginId == null ? null : socialLoginId.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}