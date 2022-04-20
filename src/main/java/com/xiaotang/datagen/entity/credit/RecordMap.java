package com.xiaotang.datagen.entity.credit;

public class RecordMap {
    //统计出的用户id
    private String ordUserId;
    //  统计出的金额
    private double money;
    //订单数量
    private Integer orderNum;

    public String getOrdUserId() {
        return ordUserId;
    }

    public void setOrdUserId(String ordUserId) {
        this.ordUserId = ordUserId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "RecordMap{" +
                "ordUserId='" + ordUserId + '\'' +
                ", money=" + money +
                ", orderNum=" + orderNum +
                '}';
    }
}
