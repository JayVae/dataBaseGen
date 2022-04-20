package com.xiaotang.datagen.entity.credit;


import java.math.BigDecimal;
import java.util.Date;

/**
 * 黑名单
 */
public class Blacklist {

    private  String  blackId;//黑名单id

    private String ordUserId;

    private Date  insertDate;

    private String blackReason;

    private BigDecimal blcakPrice;

    private Date blackContact;

    private String blackCarNum;

    public Blacklist(String blackId, String ordUserId, Date insertDate, String blackReason, BigDecimal blcakPrice, Date blackContact, String blackCarNum) {
        this.blackId = blackId;
        this.ordUserId = ordUserId;
        this.insertDate = insertDate;
        this.blackReason = blackReason;
        this.blcakPrice = blcakPrice;
        this.blackContact = blackContact;
        this.blackCarNum = blackCarNum;
    }

    public Blacklist() {
    }

    public String getBlackId() {
        return blackId;
    }

    public void setBlackId(String blackId) {
        this.blackId = blackId;
    }

    public String getOrdUserId() {
        return ordUserId;
    }

    public void setOrdUserId(String ordUserId) {
        this.ordUserId = ordUserId;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public String getBlackReason() {
        return blackReason;
    }

    public void setBlackReason(String blackReason) {
        this.blackReason = blackReason;
    }

    public BigDecimal getBlcakPrice() {
        return blcakPrice;
    }

    public void setBlcakPrice(BigDecimal blcakPrice) {
        this.blcakPrice = blcakPrice;
    }

    public Date getBlackContact() {
        return blackContact;
    }

    public void setBlackContact(Date blackContact) {
        this.blackContact = blackContact;
    }

    public String getBlackCarNum() {
        return blackCarNum;
    }

    public void setBlackCarNum(String blackCarNum) {
        this.blackCarNum = blackCarNum;
    }

    @Override
    public String toString() {
        return "Blacklist{" +
                "blackId='" + blackId + '\'' +
                ", ordUserId='" + ordUserId + '\'' +
                ", insertDate=" + insertDate +
                ", blackReason='" + blackReason + '\'' +
                ", blcakPrice=" + blcakPrice +
                ", blackContact=" + blackContact +
                ", blackCarNum='" + blackCarNum + '\'' +
                '}';
    }
}
