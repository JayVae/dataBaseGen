package com.xiaotang.datagen.entity.charging;

import java.math.BigDecimal;

/**
 * @author Administrator 车位计费详情
 */
public class ParkingBilling {
	private String pbId;
	private BigDecimal startMoney;
	private String poId;
	private BigDecimal normalMoney;
	private BigDecimal overtimeMoney;
	private BigDecimal timesavingMoney;
	private BigDecimal couponMoney;
	private BigDecimal money;
	
	private String poNum;
	
	public String getPbId() {
		return pbId;
	}
	public void setPbId(String pbId) {
		this.pbId = pbId;
	}
	public BigDecimal getStartMoney() {
		return startMoney;
	}
	public void setStartMoney(BigDecimal startMoney) {
		this.startMoney = startMoney;
	}
	public String getPoId() {
		return poId;
	}
	public void setPoId(String poId) {
		this.poId = poId;
	}
	public BigDecimal getNormalMoney() {
		return normalMoney;
	}
	public void setNormalMoney(BigDecimal normalMoney) {
		this.normalMoney = normalMoney;
	}
	public BigDecimal getOvertimeMoney() {
		return overtimeMoney;
	}
	public void setOvertimeMoney(BigDecimal overtimeMoney) {
		this.overtimeMoney = overtimeMoney;
	}
	public BigDecimal getTimesavingMoney() {
		return timesavingMoney;
	}
	public void setTimesavingMoney(BigDecimal timesavingMoney) {
		this.timesavingMoney = timesavingMoney;
	}
	public BigDecimal getCouponMoney() {
		return couponMoney== null? BigDecimal.valueOf(0):couponMoney;
	}
	public void setCouponMoney(BigDecimal couponMoney) {
		this.couponMoney = couponMoney;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public String getPoNum() {
		return poNum;
	}
	public void setPoNum(String poNum) {
		this.poNum = poNum;
	}
	@Override
	public String toString() {
		return "ParkingBilling [pbId=" + pbId + ", startMoney=" + startMoney + ", poId=" + poId + ", normalMoney="
				+ normalMoney + ", overtimeMoney=" + overtimeMoney + ", timesavingMoney=" + timesavingMoney
				+ ", couponMoney=" + couponMoney + ", money=" + money + ", poNum=" + poNum + "]";
	}
}
