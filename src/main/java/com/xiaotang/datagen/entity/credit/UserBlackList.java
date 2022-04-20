package com.xiaotang.datagen.entity.credit;



import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户黑名单
 */
public class UserBlackList {

    private String blackId;// id

    private String userName;//真实姓名

    private String phone;//手机号

    private String blackReason;//插入原因

    private Date insertDate;//插入时间

    private BigDecimal blcakPrice;//违约金额

    private Date blackContact;//到期时间

    private String userCar;//车牌号

    private String dateFormat;//时间格式转换


    public String getBlackId() {
        return blackId;
    }

    public void setBlackId(String blackId) {
        this.blackId = blackId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBlackReason() {
        return blackReason;
    }

    public void setBlackReason(String blackReason) {
        this.blackReason = blackReason;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
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

    public String getUserCar() {
        return userCar;
    }

    public void setUserCar(String userCar) {
        this.userCar = userCar;
    }


    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }
    @Override
    public String toString() {
        return "UserBlackList{" +
                "blackId='" + blackId + '\'' +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", blackReason='" + blackReason + '\'' +
                ", insertDate=" + insertDate +
                ", blcakPrice=" + blcakPrice +
                ", blackContact=" + blackContact +
                ", userCar='" + userCar + '\'' +
                ", dateFormat='" + dateFormat + '\'' +
                '}';
    }
}
