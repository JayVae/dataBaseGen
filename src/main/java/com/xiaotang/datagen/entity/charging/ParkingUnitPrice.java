package com.xiaotang.datagen.entity.charging;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator 车位发布信息
 */
public class ParkingUnitPrice {

	private String pup_id;
	private String parking_id;
	private BigDecimal pup_price;
	private Integer pup_state;// 单价状态 可修改 和不可修改状态
	@JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
	private Date pup_time;// 发布时间
	@JsonFormat(pattern = "yyyy/MM/dd HH:mm", timezone = "GMT+8")

	private String options;//其他选项

	private Date pup_start_time;// 开始时间
	@JsonFormat(pattern = "yyyy/MM/dd HH:mm", timezone = "GMT+8")
	private Date pup_end_time;// 结束时间
	private BigDecimal pupStartPrice;// 起步价格
	private Double pupStartLength;// 起步时长
	private Integer pupVersion;// 车位发布的版本信息
	private BigDecimal appendPrice;// 车位封顶价格
	private Double cappingTime;// 封顶时长
	private BigDecimal penaltyPrice;// 非共享时段单价
	private String pupState;


	private String cardId;

	private Integer sign;// 记号

	public String getPup_id() {
		return pup_id;
	}

	public void setPup_id(String pup_id) {
		this.pup_id = pup_id;
	}

	public String getParking_id() {
		return parking_id;
	}

	public void setParking_id(String parking_id) {
		this.parking_id = parking_id;
	}

	public BigDecimal getPup_price() {
		return pup_price;
	}

	public void setPup_price(BigDecimal pup_price) {
		this.pup_price = pup_price;
	}

	public Integer getPup_state() {
		return pup_state;
	}

	public void setPup_state(Integer pup_state) {
		this.pup_state = pup_state;
	}

	public Date getPup_time() {
		return pup_time;
	}

	public void setPup_time(Date pup_time) {
		this.pup_time = pup_time;
	}

	public Date getPup_start_time() {
		return pup_start_time;
	}

	public void setPup_start_time(Date pup_start_time) {
		this.pup_start_time = pup_start_time;
	}

	public Date getPup_end_time() {
		return pup_end_time;
	}

	public void setPup_end_time(Date pup_end_time) {
		this.pup_end_time = pup_end_time;
	}

	public BigDecimal getPupStartPrice() {
		return pupStartPrice;
	}

	public void setPupStartPrice(BigDecimal pupStartPrice) {
		this.pupStartPrice = pupStartPrice;
	}

	public Double getPupStartLength() {
		return pupStartLength;
	}

	public void setPupStartLength(Double pupStartLength) {
		this.pupStartLength = pupStartLength;
	}

	public Integer getPupVersion() {
		return pupVersion;
	}

	public void setPupVersion(Integer pupVersion) {
		this.pupVersion = pupVersion;
	}

	public BigDecimal getAppendPrice() {
		return appendPrice;
	}

	public void setAppendPrice(BigDecimal appendPrice) {
		this.appendPrice = appendPrice;
	}

	public Double getCappingTime() {
		return cappingTime;
	}

	public void setCappingTime(Double cappingTime) {
		this.cappingTime = cappingTime;
	}

	public Integer getSign() {
		return sign == null? 0 :sign;
	}

	public void setSign(Integer sign) {
		this.sign = sign;
	}

	public BigDecimal getPenaltyPrice() {
		return penaltyPrice;
	}

	public void setPenaltyPrice(BigDecimal penaltyPrice) {
		this.penaltyPrice = penaltyPrice;
	}

	public String getPupState() {
		return pupState;
	}

	public void setPupState(Integer pup_state) {
		switch (pup_state) {
			case 1:
				this.pupState = "空闲";
				break;
			case 2:
				this.pupState = "车位已预约";
				break;
			case 3:
				this.pupState = "车位正在被预约";
				break;
			default:
				break;
		}

	}

	public Date getDate(List<ParkingUnitPrice> listParking) {
		List<Date> list = new ArrayList<Date>();
		for (ParkingUnitPrice parkingUnitPrice : listParking) {
			list.add(parkingUnitPrice.getPup_start_time());
		}
		//最小开始时间
		Date date = Collections.min(list);
		return date;

	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}


	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	@Override
	public String toString() {
		return "ParkingUnitPrice{" +
				"pup_id='" + pup_id + '\'' +
				", parking_id='" + parking_id + '\'' +
				", pup_price=" + pup_price +
				", pup_state=" + pup_state +
				", pup_time=" + pup_time +
				", pup_start_time=" + pup_start_time +
				", pup_end_time=" + pup_end_time +
				", pupStartPrice=" + pupStartPrice +
				", pupStartLength=" + pupStartLength +
				", pupVersion=" + pupVersion +
				", appendPrice=" + appendPrice +
				", cappingTime=" + cappingTime +
				", penaltyPrice=" + penaltyPrice +
				", options='" + options + '\'' +
				", pupState='" + pupState + '\'' +
				", cardId='" + cardId + '\'' +
				", sign=" + sign +
				'}';
	}

	/**
	 * @param p
	 * @return 计费合并时段的判断
	 */
	public boolean equalsParkingUnitPrice(ParkingUnitPrice p){
		if(p == null){
			return false;
		}else{
			//如果封顶价跟封顶时长相等 单价相等
			if(p.getAppendPrice().compareTo(this.appendPrice)==0
					&& p.getCappingTime().equals(this.cappingTime)
					&& p.pup_price.compareTo(this.pup_price)==0){
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else {
			if (obj instanceof ParkingUnitPrice) {
				ParkingUnitPrice pup = (ParkingUnitPrice) obj;
				if ((pup.getPup_price() != null) && (pup.getPupStartPrice() != null)
						&& (pup.getPupStartLength() != null) && (pup.getAppendPrice() != null)
						&& (pup.getCappingTime() != null) && (pup.getPup_state() != null)) {
					if ((pup.getPup_price().compareTo(this.pup_price) == 0)
							&& (pup.getPupStartPrice().compareTo(this.getPupStartPrice()) == 0)
							&& (pup.getPupStartLength().equals(this.pupStartLength))
							&& (pup.getAppendPrice().compareTo(this.appendPrice) == 0)
							&& (pup.getCappingTime().equals(this.cappingTime))
							&& (pup.getPup_state() == this.getPup_state())) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * @param parkingUnitPrice
	 * @return 查询推荐车位的前十条时段信息
	 */
	public  boolean  equalsParam(ParkingUnitPrice parkingUnitPrice) {
		boolean  flag = true;
		if(null == parkingUnitPrice.getParking_id() || parkingUnitPrice.getParking_id() == " "|| parkingUnitPrice.getParking_id().equals(null) || " ".equals(parkingUnitPrice.getParking_id())) {
			flag = false;
		}
		if(parkingUnitPrice.getPupStartLength() == 0 || null == parkingUnitPrice.getPupStartLength()) {
			flag  = false;
		}
		if(parkingUnitPrice.getPup_start_time() == null ) {
			flag = false;
		}
		return flag;
	}


}
