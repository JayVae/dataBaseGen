package com.xiaotang.datagen.entity.charging;



import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Administrator 优惠劵信息
 */
public class Coupon {
	
	private String coupon_id;
	private String user_id;
	private String couponName;
	private BigDecimal coupon_money;

	private Date start_time;

	private Date end_time;
	private Integer coupon_state;
	private Integer couponVersion;
	
	
	
	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCoupon_id() {
		return coupon_id;
	}

	public void setCoupon_id(String coupon_id) {
		this.coupon_id = coupon_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public BigDecimal getCoupon_money() {
		return coupon_money;
	}

	public void setCoupon_money(BigDecimal coupon_money) {
		this.coupon_money = coupon_money;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	
	public Integer getCoupon_state() {
		return coupon_state;
	}

	public void setCoupon_state(Integer coupon_state) {
		this.coupon_state = coupon_state;
	}

	
	
	public Integer getCouponVersion() {
		return couponVersion;
	}

	public void setCouponVersion(Integer couponVersion) {
		this.couponVersion = couponVersion;
	}

	@Override
	public String toString() {
		return "Coupon [coupon_id=" + coupon_id + ", user_id=" + user_id + ", couponName=" + couponName
				+ ", coupon_money=" + coupon_money + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", coupon_state=" + coupon_state + ", couponVersion=" + couponVersion + "]";
	}

	
	
}
