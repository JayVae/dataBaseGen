package com.xiaotang.datagen.entity.charging.detailed;



import java.util.Date;

/**
 * 车位使用的交易详情
 * */
public class Detailed {
	
	private  String detailedId;
	
	private String userId;
	
	private String parkingNum;

	private Date detailedDate;
	
	private String detailedNum;
	
	private String address;
	
	private String detailedType;
	
	private  String detailedMoney;
	
	private String detailedMode;

	public String getDetailedId() {
		return detailedId;
	}

	public void setDetailedId(String detailedId) {
		this.detailedId = detailedId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getParkingNum() {
		return parkingNum;
	}

	public void setParkingNum(String parkingNum) {
		this.parkingNum = parkingNum;
	}

	public Date getDetailedDate() {
		return detailedDate;
	}

	public void setDetailedDate(Date detailedDate) {
		this.detailedDate = detailedDate;
	}

	public String getDetailedNum() {
		return detailedNum;
	}

	public void setDetailedNum(String detailedNum) {
		this.detailedNum = detailedNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetailedType() {
		return detailedType;
	}

	public void setDetailedType(String detailedType) {
		this.detailedType = detailedType;
	}

	public String getDetailedMoney() {
		return detailedMoney;
	}

	public void setDetailedMoney(String detailedMoney) {
		this.detailedMoney = detailedMoney;
	}

	public String getDetailedMode() {
		return detailedMode;
	}

	public void setDetailedMode(String detailedMode) {
		this.detailedMode = detailedMode;
	}

	@Override
	public String toString() {
		return "Detailed [detailedId=" + detailedId + ", userId=" + userId + ", parkingNum=" + parkingNum
				+ ", detailedDate=" + detailedDate + ", detailedNum=" + detailedNum + ", address=" + address
				+ ", detailedType=" + detailedType + ", detailedMoney=" + detailedMoney + ", detailedMode="
				+ detailedMode + "]";
	}

}
