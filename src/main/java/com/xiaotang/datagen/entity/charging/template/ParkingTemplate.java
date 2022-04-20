package com.xiaotang.datagen.entity.charging.template;

import com.xiaotang.datagen.entity.merchant.ParkingPlace;

/**
 * 时段发布模板与车位的映射实体类
 * 王锐
 *2018/11/28 
 * */


public class ParkingTemplate {
	
	private String parkingTemplateId;//主键
	
	private String parkingPlaceId;//车位id
	
	private Integer choice;//是否选择
	
	private String templateId;//模板id
	
	private ParkingPlace parkingPlace;//车位映射

	public String getParkingTemplateId() {
		return parkingTemplateId;
	}

	public void setParkingTemplateId(String parkingTemplateId) {
		this.parkingTemplateId = parkingTemplateId;
	}

	public String getParkingPlaceId() {
		return parkingPlaceId;
	}

	public void setParkingPlaceId(String parkingPlaceId) {
		this.parkingPlaceId = parkingPlaceId;
	}

	public Integer getChoice() {
		return choice;
	}

	public void setChoice(Integer choice) {
		this.choice = choice;
	}
	
	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public ParkingPlace getParkingPlace() {
		return parkingPlace;
	}

	public void setParkingPlace(ParkingPlace parkingPlace) {
		this.parkingPlace = parkingPlace;
	}

	@Override
	public String toString() {
		return "ParkingTemplate [parkingTemplateId=" + parkingTemplateId + ", parkingPlaceId=" + parkingPlaceId
				+ ", choice=" + choice + ", templateId=" + templateId + ", parkingPlace=" + parkingPlace + "]";
	}
	
}
