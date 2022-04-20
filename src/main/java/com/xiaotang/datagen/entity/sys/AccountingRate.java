package com.xiaotang.datagen.entity.sys;



import java.util.Date;

public class AccountingRate {
    private String accountingRateId;
    /**
     *
     * id为需分成的用户
     */
    private String housingEstateId;

    private Double percent;
    /**
     * 0普通分成费率  1 物业楼盘   2市场人员分成费率 3分享用户分成费率
     */
    private Integer rateType;


    private Date terminatedDate;


    private Date createTime;
    /**
     * 0 正常计费 1停止
     */
    private Integer terminatedFlag;

    public String getAccountingRateId() {
        return accountingRateId;
    }

    public void setAccountingRateId(String accountingRateId) {
        this.accountingRateId = accountingRateId == null ? null : accountingRateId.trim();
    }

    public String getHousingEstateId() {
        return housingEstateId;
    }

    public void setHousingEstateId(String housingEstateId) {
        this.housingEstateId = housingEstateId == null ? null : housingEstateId.trim();
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }
    public Integer getRateType() {
        return rateType;
    }

    public void setRateType(Integer rateType) {
        this.rateType = rateType;
    }
    public Date getTerminatedDate() {
        return terminatedDate;
    }

    public void setTerminatedDate(Date terminatedDate) {
        this.terminatedDate = terminatedDate;
    }

    public Integer getTerminatedFlag() {
        return terminatedFlag;
    }

    public void setTerminatedFlag(Integer terminatedFlag) {
        this.terminatedFlag = terminatedFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}