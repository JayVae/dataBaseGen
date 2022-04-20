package com.xiaotang.datagen.entity.charging.coupon;

import java.math.BigDecimal;

public class CouponCard {
	
	private  String couponCardId;
	
	private BigDecimal salesMoney;
	
	private BigDecimal purposemoney;
	
	private  Integer  validityTimeDay;
	
	private Integer couponCardState;
	
	private String couponCardDesc;
	
	private Integer couponCardVersion;

	public String getCouponCardId() {
		return couponCardId;
	}

	public void setCouponCardId(String couponCardId) {
		this.couponCardId = couponCardId;
	}

	public BigDecimal getSalesMoney() {
		return salesMoney;
	}

	public void setSalesMoney(BigDecimal salesMoney) {
		this.salesMoney = salesMoney;
	}

	public BigDecimal getPurposemoney() {
		return purposemoney;
	}

	public void setPurposemoney(BigDecimal purposemoney) {
		this.purposemoney = purposemoney;
	}

	public Integer getValidityTimeDay() {
		return validityTimeDay;
	}

	public void setValidityTimeDay(Integer validityTimeDay) {
		this.validityTimeDay = validityTimeDay;
	}

	public Integer getCouponCardState() {
		return couponCardState;
	}

	public void setCouponCardState(Integer couponCardState) {
		this.couponCardState = couponCardState;
	}

	public String getCouponCardDesc() {
		return couponCardDesc;
	}

	public void setCouponCardDesc(String couponCardDesc) {
		this.couponCardDesc = couponCardDesc;
	}

	public Integer getCouponCardVersion() {
		return couponCardVersion;
	}

	public void setCouponCardVersion(Integer couponCardVersion) {
		this.couponCardVersion = couponCardVersion;
	}

	@Override
	public String toString() {
		return "CouponCard [couponCardId=" + couponCardId + ", salesMoney=" + salesMoney + ", purposemoney="
				+ purposemoney + ", validityTimeDay=" + validityTimeDay + ", couponCardState=" + couponCardState
				+ ", couponCardDesc=" + couponCardDesc + ", couponCardVersion=" + couponCardVersion + "]";
	}


}
