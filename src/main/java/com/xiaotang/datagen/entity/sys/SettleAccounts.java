package com.xiaotang.datagen.entity.sys;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class SettleAccounts {
    private String settleAccountsId;

    private String housingEstateId;

    private BigDecimal amount;
    /**
     * 0未确认  1已确认 3拒绝  4支付成功 5支付失败
     */
    private Integer state;
    /**
     * 0车位拥有者结算  1车位所属楼盘结算  2市场人员结算分成  3分享小程序人员结算分成
     */
    private Integer settletype;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date settleAcoountsDate;

    private Date createTime;

    private String notes;

    public String getSettleAccountsId() {
        return settleAccountsId;
    }

    public void setSettleAccountsId(String settleAccountsId) {
        this.settleAccountsId = settleAccountsId == null ? null : settleAccountsId.trim();
    }

    public String getHousingEstateId() {
        return housingEstateId;
    }

    public void setHousingEstateId(String housingEstateId) {
        this.housingEstateId = housingEstateId == null ? null : housingEstateId.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getSettleAcoountsDate() {
        return settleAcoountsDate;
    }

    public void setSettleAcoountsDate(Date settleAcoountsDate) {
        this.settleAcoountsDate = settleAcoountsDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public SettleAccounts(String settleAccountsId, String housingEstateId, BigDecimal amount, Integer state, Date settleAcoountsDate, Date createTime, String notes) {
        this.settleAccountsId = settleAccountsId;
        this.housingEstateId = housingEstateId;
        this.amount = amount;
        this.state = state;
        this.settleAcoountsDate = settleAcoountsDate;
        this.createTime = createTime;
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public SettleAccounts() {
    }

    public SettleAccounts(String settleAccountsId, String housingEstateId, BigDecimal amount, Integer state, Integer settletype, Date settleAcoountsDate, Date createTime, String notes) {
        this.settleAccountsId = settleAccountsId;
        this.housingEstateId = housingEstateId;
        this.amount = amount;
        this.state = state;
        this.settletype = settletype;
        this.settleAcoountsDate = settleAcoountsDate;
        this.createTime = createTime;
        this.notes = notes;
    }

    public Integer getSettletype() {
        return settletype;
    }

    public void setSettletype(Integer settletype) {
        this.settletype = settletype;
    }
}