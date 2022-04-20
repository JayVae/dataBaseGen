package com.xiaotang.datagen.entity.charging.template;

import java.math.BigDecimal;
import java.util.List;


/**
 * 发布时段模板
 * 王锐
 * 2018/11/28
 * */

/**
 * @author Administrator
 *
 */
public class Template {
	
	private String templateId;//发布时段模板id
	
	private String  startDate;//发布的开始时间
	
	private String endDate;//发布的结束时间
	
	private Integer days;//发布的天数
	
	private BigDecimal price;//发布的单价
	
	private BigDecimal startPrice;//起步价
	
	private Double startLength;//起步时长
	
	private BigDecimal cappingPrice;//封顶价格
	
	private Double cappingLength;//封顶时长
	
	private String ordUserId;//用户id
	
	private  String templateName;//模板名称
	
	private List<Week>  listWeeks;//模板与周期的映射
	
	private List<ParkingTemplate> listParking;//模板与车位的映射
	
	private List<String> listStr;//添加模板是模板中存储的车位编号
	
	private List<Integer> listW;//添加模板时选择的周期

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(BigDecimal startPrice) {
		this.startPrice = startPrice;
	}

	public BigDecimal getCappingPrice() {
		return cappingPrice;
	}

	public void setCappingPrice(BigDecimal cappingPrice) {
		this.cappingPrice = cappingPrice;
	}
	

	public Double getStartLength() {
		return startLength;
	}

	public void setStartLength(Double startLength) {
		this.startLength = startLength;
	}

	public Double getCappingLength() {
		return cappingLength;
	}

	public void setCappingLength(Double cappingLength) {
		this.cappingLength = cappingLength;
	}

	public String getOrdUserId() {
		return ordUserId;
	}

	public void setOrdUserId(String ordUserId) {
		this.ordUserId = ordUserId;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	
	
	public List<Week> getListWeeks() {
		return listWeeks;
	}

	public void setListWeeks(List<Week> listWeeks) {
		this.listWeeks = listWeeks;
	}

	public List<ParkingTemplate> getListParking() {
		return listParking;
	}

	public void setListParking(List<ParkingTemplate> listParking) {
		this.listParking = listParking;
	}

	public List<String> getListStr() {
		return listStr;
	}

	public void setListStr(List<String> listStr) {
		this.listStr = listStr;
	}
	
	public List<Integer> getListW() {
		return listW;
	}

	public void setListW(List<Integer> listW) {
		this.listW = listW;
	}

	@Override
	public String toString() {
		return "Template [templateId=" + templateId + ", startDate=" + startDate + ", endDate=" + endDate + ", days="
				+ days + ", price=" + price + ", startPrice=" + startPrice + ", startLength=" + startLength
				+ ", cappingPrice=" + cappingPrice + ", cappingLength=" + cappingLength + ", ordUserId=" + ordUserId
				+ ", templateName=" + templateName + ", listWeeks=" + listWeeks + ", listParking=" + listParking
				+ ", listStr=" + listStr + ", listW=" + listW + "]";
	}

}
