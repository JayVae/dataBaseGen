package com.xiaotang.datagen.entity.credit;

import java.util.Date;

public class Credit{

    private String creditId;

    private String ordUserId;

    private Integer orderCredit;//订单信用

    private Integer parkingCredit;//车位履行的信用分

    private Integer otherCredit;//其他认证信用分增加

    private Integer deduction;//扣除的信用分

    private Integer total; //总分数
    private Date creditDate;

    private Integer version;//更新版本号

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    public String getOrdUserId() {
        return ordUserId;
    }

    public void setOrdUserId(String ordUserId) {
        this.ordUserId = ordUserId;
    }

    public Integer getOrderCredit() {
        return orderCredit == null? 0:orderCredit;
    }

    public void setOrderCredit(Integer orderCredit) {
        this.orderCredit = orderCredit;
    }

    public Integer getParkingCredit() {
        return parkingCredit == null ? 0:parkingCredit;
    }

    public void setParkingCredit(Integer parkingCredit) {
        this.parkingCredit = parkingCredit;
    }

    public Integer getOtherCredit() {
        return otherCredit == null? 0:otherCredit;
    }

    public void setOtherCredit(Integer otherCredit) {
        this.otherCredit = otherCredit;
    }

    public Integer getDeduction() {
        return deduction == null? 0:deduction;
    }

    public void setDeduction(Integer deduction) {
        this.deduction = deduction;
    }

    public Integer getTotal() {
        return total ==null ? 0:total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Date getCreditDate() {
        return creditDate;
    }

    public void setCreditDate(Date creditDate) {
        this.creditDate = creditDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "creditId='" + creditId + '\'' +
                ", ordUserId='" + ordUserId + '\'' +
                ", orderCredit=" + orderCredit +
                ", parkingCredit=" + parkingCredit +
                ", otherCredit=" + otherCredit +
                ", deduction=" + deduction +
                ", total=" + total +
                ", creditDate=" + creditDate +
                ", version=" + version +
                '}';
    }
}
