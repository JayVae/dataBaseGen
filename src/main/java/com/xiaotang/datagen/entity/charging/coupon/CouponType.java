package com.xiaotang.datagen.entity.charging.coupon;

public class CouponType {
	
	private String couponTypeId; 
	
	private String couponName;
	
	private Integer couponNo;

	public String getCouponTypeId() {
		return couponTypeId;
	}

	public void setCouponTypeId(String couponTypeId) {
		this.couponTypeId = couponTypeId;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Integer getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(Integer couponNo) {
		this.couponNo = couponNo;
	}

	@Override
	public String toString() {
		return "CouponType [couponTypeId=" + couponTypeId + ", couponName=" + couponName + ", couponNo=" + couponNo
				+ "]";
	}
}
