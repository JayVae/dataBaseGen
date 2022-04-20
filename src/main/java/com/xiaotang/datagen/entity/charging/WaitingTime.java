package com.xiaotang.datagen.entity.charging;


import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单与等待时长映射
 * */
public class WaitingTime {
	
	private String waitingId;
	

	private Date applicationTime;//申请时间

	private Date  entryTime;//实际开始时间
	
	private Double waitingLength;
	
	private BigDecimal cost;//延误的费用

	public String getWaitingId() {
		return waitingId;
	}

	public void setWaitingId(String waitingId) {
		this.waitingId = waitingId;
	}

	public Date getApplicationTime() {
		return applicationTime;
	}

	public void setApplicationTime(Date applicationTime) {
		this.applicationTime = applicationTime;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public Double getWaitingLength() {
		return waitingLength;
	}

	public void setWaitingLength(Double waitingLength) {
		this.waitingLength = waitingLength;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "WaitingTime [waitingId=" + waitingId + ", applicationTime=" + applicationTime + ", entryTime="
				+ entryTime + ", waitingLength=" + waitingLength + ", cost=" + cost + "]";
	}

}
