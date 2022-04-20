package com.xiaotang.datagen.entity.charging.template;

import java.util.LinkedList;
import java.util.List;

/**
 * 共享时段发布模板与周天的映射
 * 王锐
 * 2018/11/28
 * */
public class Week {
	
	private String weekId;//id
	
	private String templateId;//模板id
	
	private Integer weekNum; //选中的周几
	
	private Integer chorice;//是否选中
	
	private String weekToDay;//星期几

 	public String getWeekToDay() {
		return weekToDay;
	}

	public void setWeekToDay(Integer weekNum) {
 		switch (weekNum) {
		case 1:
			weekToDay = "星期一";
			
			break;
		case 2:
			weekToDay = "星期二";
			break;
		case 3:
			weekToDay = "星期三";
			break;
		case 4:
			weekToDay = "星期四";
			break;
		case 5:
			weekToDay = "星期五";
			break;
		case 6:
			weekToDay = "星期六";
			break;
		case 7:
			weekToDay = "星期日";
			break;
		default:
			break;
		}
	}

	public String getWeekId() {
		return weekId;
	}

	public void setWeekId(String weekId) {
		this.weekId = weekId;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public Integer getWeekNum() {
		return weekNum;
	}

	public void setWeekNum(Integer weekNum) {
		this.weekNum = weekNum;
	}

	public Integer getChorice() {
		return chorice;
	}

	public void setChorice(Integer chorice) {
		this.chorice = chorice;
	}
	
	public List<Integer>  getChoriceWeekNo(List<Week> list){
		List<Integer> lists = new LinkedList<Integer>();
		for (Week week : list) {
			lists.add(week.getWeekNum());
		}
		 return lists;
	}
	
	@Override
	public String toString() {
		return "Week [weekId=" + weekId + ", templateId=" + templateId + ", weekNum=" + weekNum + ", chorice=" + chorice
				+ ", weekToDay=" + weekToDay + "]";
	}

}
