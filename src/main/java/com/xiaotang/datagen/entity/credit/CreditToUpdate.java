package com.xiaotang.datagen.entity.credit;



import java.util.Date;

public class CreditToUpdate {

    private  String ctuId;

    private String ordUserId;

    private Date updateDate;

    private Integer updateFraction;

    private String reason;

    public String getCtuId() {
        return ctuId;
    }

    public void setCtuId(String ctuId) {
        this.ctuId = ctuId;
    }

    public String getOrdUserId() {
        return ordUserId;
    }

    public void setOrdUserId(String ordUserId) {
        this.ordUserId = ordUserId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getUpdateFraction() {
        return updateFraction;
    }

    public void setUpdateFraction(Integer updateFraction) {
        this.updateFraction = updateFraction;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "CreditToUpdate{" +
                "ctuId='" + ctuId + '\'' +
                ", ordUserId='" + ordUserId + '\'' +
                ", updateDate=" + updateDate +
                ", updateFraction=" + updateFraction +
                ", reason='" + reason + '\'' +
                '}';
    }
}
