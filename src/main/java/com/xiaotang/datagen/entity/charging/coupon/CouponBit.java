package com.xiaotang.datagen.entity.charging.coupon;


import java.math.BigDecimal;
import java.util.Date;

public class CouponBit {
	
	private String  couponDetId;
	
	private String  couponTypeId;

	private Date couponDate; //优惠劵数量
	
	private Integer couponLengthDay;
	
	private Integer couponVersion;
	
	private BigDecimal fullMoney;

	private BigDecimal reduceMoney;
	
	private Double discount;
	
	private BigDecimal discountedMoney;
	
	private String coupondesc;
	
	private Integer couponState ;
	
	private String couponName;
	
	private Integer limitNum;

	private CouponType couponType;
	
	private String couponTypeName;

	public String getCouponDetId() {
		return couponDetId;
	}

	public void setCouponDetId(String couponDetId) {
		this.couponDetId = couponDetId;
	}

	public String getCouponTypeId() {
		return couponTypeId;
	}

	public void setCouponTypeId(String couponTypeId) {
		this.couponTypeId = couponTypeId;
	}

	public Date getCouponDate() {
		return couponDate;
	}

	public void setCouponDate(Date couponDate) {
		this.couponDate = couponDate;
	}

	public Integer getCouponLengthDay() {
		return couponLengthDay == null? 0:couponLengthDay;
	}

	public void setCouponLengthDay(Integer couponLengthDay) {
		this.couponLengthDay = couponLengthDay;
	}

	public Integer getCouponVersion() {
		return couponVersion;
	}

	public void setCouponVersion(Integer couponVersion) {
		this.couponVersion = couponVersion;
	}

	public BigDecimal getFullMoney() {
		return fullMoney;
	}

	public void setFullMoney(BigDecimal fullMoney) {
		this.fullMoney = fullMoney;
	}

	public BigDecimal getReduceMoney() {
		return reduceMoney;
	}

	public void setReduceMoney(BigDecimal reduceMoney) {
		this.reduceMoney = reduceMoney;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public BigDecimal getDiscountedMoney() {
		return discountedMoney;
	}

	public void setDiscountedMoney(BigDecimal discountedMoney) {
		this.discountedMoney = discountedMoney;
	}

	public String getCoupondesc() {
		return coupondesc;
	}

	public void setCoupondesc(String coupondesc) {
		this.coupondesc = coupondesc;
	}

	public Integer getCouponState() {
		return couponState;
	}

	public void setCouponState(Integer couponState) {
		this.couponState = couponState;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Integer getLimitNum() {
		return limitNum;
	}

	public void setLimitNum(Integer limitNum) {
		this.limitNum = limitNum;
	}

	public CouponType getCouponType() {
		return couponType;
	}

	public void setCouponType(CouponType couponType) {
		this.couponType = couponType;
	}

	public String getCouponTypeName() {
		return couponTypeName;
	}

	public void setCouponTypeName(String couponTypeName) {
		this.couponTypeName = couponTypeName;
	}

	@Override
	public String toString() {
		return "CouponBit [couponDetId=" + couponDetId + ", couponTypeId=" + couponTypeId + ", couponDate=" + couponDate
				+ ", couponLengthDay=" + couponLengthDay + ", couponVersion=" + couponVersion + ", fullMoney="
				+ fullMoney + ", reduceMoney=" + reduceMoney + ", discount=" + discount + ", discountedMoney="
				+ discountedMoney + ", coupondesc=" + coupondesc + ", couponState=" + couponState + ", couponName="
				+ couponName + ", limitNum=" + limitNum + ", couponType=" + couponType + ", couponTypeName="
				+ couponTypeName + "]";
	}
	
	
}
