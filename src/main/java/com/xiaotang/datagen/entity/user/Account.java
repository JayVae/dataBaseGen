package com.xiaotang.datagen.entity.user;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    //0:禁止登录
    public static final Long _0 = new Long(0);
    //1:有效
    public static final Long _1 = new Long(1);

    private String accountId;

    private String phone;

    private String password;
    /**
     * 1 普通用户 2物业经理   3 物业财务 4小区保安  5系统管理员 6系统财务 7市场专员  8运营专员
     */
    private Integer type;

    private Integer state;

    private Date creatTime;

    private Date lastLoginTime;

    public Account() {
    }

    public Account(String accountId, String phone, String password, Integer type, Integer state, Date creatTime, Date lastLoginTime) {
        this.accountId = accountId;
        this.phone = phone;
        this.password = password;
        this.type = type;
        this.state = state;
        this.creatTime = creatTime;
        this.lastLoginTime = lastLoginTime;
    }

    public Account(Account account){
        this.accountId = account.accountId;
        this.phone = account.phone;
        this.password = account.password;
        this.type = account.type;
        this.state = account.state;
        this.creatTime = account.creatTime;
        this.lastLoginTime = account.lastLoginTime;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}