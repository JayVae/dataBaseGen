package com.xiaotang.datagen.entity.credit;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author  wangrui
 * 2018/12/13 15:08
 * 用户行为记录
 */
public class Record {

    private String recordId;

    private String ordUserId;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private Date recordTime;

    private BigDecimal recordPrice;

    private String recordPoId;

    private String recordParkingPlace;


    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getOrdUserId() {
        return ordUserId;
    }

    public void setOrdUserId(String ordUserId) {
        this.ordUserId = ordUserId;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public BigDecimal getRecordPrice() {
        return recordPrice;
    }

    public void setRecordPrice(BigDecimal recordPrice) {
        this.recordPrice = recordPrice;
    }

    public String getRecordPoId() {
        return recordPoId;
    }

    public void setRecordPoId(String recordPoId) {
        this.recordPoId = recordPoId;
    }

    public String getRecordParkingPlace() {
        return recordParkingPlace;
    }

    public void setRecordParkingPlace(String recordParkingPlace) {
        this.recordParkingPlace = recordParkingPlace;
    }

    @Override
    public String toString() {
        return "Record{" +
                "recordId='" + recordId + '\'' +
                ", ordUserId='" + ordUserId + '\'' +
                ", recordTime=" + recordTime +
                ", recordPrice=" + recordPrice +
                ", recordPoId='" + recordPoId + '\'' +
                ", recordParkingPlace='" + recordParkingPlace + '\'' +
                '}';
    }
}
