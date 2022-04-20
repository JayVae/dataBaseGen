package com.xiaotang.datagen.entity.user;

import java.math.BigDecimal;

public class OrdUser {
    private String orduserid;

    private String accountId;

    private String nickname;

    private String realname;

    private String email;

    private String address;

    private String sex;

    private String notes;

    private String identitynum;

    private String identitypic;

    private String shareUser;

    private BigDecimal rechargeAmount;

    private BigDecimal totalAmount;

    public String getOrduserid() {
        return orduserid;
    }

    public void setOrduserid(String orduserid) {
        this.orduserid = orduserid == null ? null : orduserid.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getIdentitynum() {
        return identitynum;
    }

    public void setIdentitynum(String identitynum) {
        this.identitynum = identitynum == null ? null : identitynum.trim();
    }

    public String getIdentitypic() {
        return identitypic;
    }

    public void setIdentitypic(String identitypic) {
        this.identitypic = identitypic == null ? null : identitypic.trim();
    }

    public String getShareUser() {
        return shareUser;
    }

    public void setShareUser(String shareUser) {
        this.shareUser = shareUser == null ? null : shareUser.trim();
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}