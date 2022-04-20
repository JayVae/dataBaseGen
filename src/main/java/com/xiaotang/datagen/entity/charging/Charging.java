package com.xiaotang.datagen.entity.charging;

import java.math.BigDecimal;
import java.util.Date;



public class Charging {

	private BigDecimal money; // 计费总价

	private BigDecimal finalMoney;// 罚时价格

	private BigDecimal offMoney;//省时价格

	private double avgMoney;

	private BigDecimal total;//已支付的金额

	private BigDecimal appendMoney;//超出封顶时长的封顶价格

	private Double couponMoney;//优惠的金额

	private  Double payment;//还需支付的金额

	private double  miunt ;//计算的时长

	private Date startDate; //计费的开始时间

	private  Date  endDate;// 计费的结束时间

	private Date  termination;//计费终止时间

	public BigDecimal getMoney() {
		return money == null? BigDecimal.valueOf(0):money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money == null ? BigDecimal.valueOf(0):money;
	}

	public BigDecimal getFinalMoney() {
		return finalMoney ==null? BigDecimal.valueOf(0):finalMoney;
	}

	public void setFinalMoney(BigDecimal finalMoney) {
		this.finalMoney = finalMoney;
	}

	public BigDecimal getOffMoney() {
		return offMoney == null? BigDecimal.valueOf(0):offMoney ;
	}

	public void setOffMoney(BigDecimal offMoney) {
		this.offMoney = offMoney;
	}

	public double getAvgMoney() {
		return avgMoney ;
	}


	public BigDecimal getAppendMoney() {
		return appendMoney== null? BigDecimal.valueOf(0):appendMoney;
	}

	public void setAppendMoney(BigDecimal appendMoney) {
		this.appendMoney = appendMoney;
	}

	public BigDecimal getTotal() {
		return total==null? BigDecimal.valueOf(0):total  ;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Double getCouponMoney() {
		return couponMoney== null? 0.0:couponMoney ;
	}

	public void setCouponMoney(Double couponMoney) {
		this.couponMoney = couponMoney;
	}

	public Double getPayment() {
		return payment ==null? 0.0:payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}


	public double getMiunt() {
		return miunt ;
	}

	public void setMiunt(double miunt) {
		this.miunt = miunt;
	}

	public Date getTermination() {
		return termination;
	}

	public void setTermination(Date termination) {
		this.termination = termination;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Charging{" +
				"money=" + money +
				", finalMoney=" + finalMoney +
				", offMoney=" + offMoney +
				", avgMoney=" + avgMoney +
				", total=" + total +
				", appendMoney=" + appendMoney +
				", couponMoney=" + couponMoney +
				", payment=" + payment +
				", miunt=" + miunt +
				", startDate=" + startDate +
				", endDate=" + endDate +
				", termination=" + termination +
				'}';
	}
}
