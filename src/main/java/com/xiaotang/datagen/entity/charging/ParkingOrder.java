package com.xiaotang.datagen.entity.charging;



import com.xiaotang.datagen.entity.merchant.HousingEstate;
import com.xiaotang.datagen.entity.merchant.ParkingLot;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Administrator 车位预约信息
 */
public class ParkingOrder {

	private String po_id;// 订单编号
	private String userCardId;// 汽车编号
	private String parking_id;// 车位id
	private String pup_id;// 发布id

	private Date poStartTime;// 预约开始时间

	private Date poEndTime;// 预约结束时间

	private Date poTime;// 预约时间
	private Integer poState;// 订单状态
	private Double poLength;// 预约时长
	private BigDecimal poPrice;// 订单缴纳金额
	private Integer poVersion;// 版本信息
	private BigDecimal poMoney;// 预约价格
	private String couponId;// 优惠劵id

	private Date factBeginTime;// 实际开始时间

	private Date factEndTime;// 实际结束时间
	private BigDecimal total;
	private Integer fine;
	private BigDecimal delay;
	private String weChatPay;// 微信支付的唯一单号
	
	private String reasonsForRejection;//拒绝原因

	private String formid;
	
	private BigDecimal fineMoney;// 罚时价

	private String parkingNum;// 车位编号
	
	private String parkingLot;//停车场地址
	
	private String parkingordernum;//订单编号
	
	private String housingEstateId;//小区id
	
	private String userPhone;
	
	private ParkingLot  parkingLot2;
	
	private HousingEstate housingEstate;
	
	private String userId;
	
	

	public HousingEstate getHousingEstate() {
		return housingEstate;
	}

	public void setHousingEstate(HousingEstate housingEstate) {
		this.housingEstate = housingEstate;
	}

	public ParkingLot getParkingLot2() {
		return parkingLot2;
	}

	public void setParkingLot2(ParkingLot parkingLot2) {
		this.parkingLot2 = parkingLot2;
	}

	public String getHousingEstateId() {
		return housingEstateId;
	}

	public void setHousingEstateId(String housingEstateId) {
		this.housingEstateId = housingEstateId;
	}

	public String getFormid() {
		return formid;
	}

	public void setFormid(String formid) {
		this.formid = formid;
	}

	public String getParkingordernum() {
		return parkingordernum;
	}

	public void setParkingordernum(String parkingordernum) {
		this.parkingordernum = parkingordernum;
	}

	public String getParkingLot() {
		return parkingLot;
	}

	public void setParkingLot(String parkingLot) {
		this.parkingLot = parkingLot;
	}

	public String getParkingNum() {
		return parkingNum;
	}

	public void setParkingNum(String parkingNum) {
		this.parkingNum = parkingNum;
	}

	public BigDecimal getFineMoney() {
		return fineMoney;
	}

	public void setFineMoney(BigDecimal fineMoney) {
		this.fineMoney = fineMoney;
	}



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public BigDecimal getDelay() {
		return delay;
	}

	public void setDelay(BigDecimal delay) {
		this.delay = delay;
	}

	private String POSTATE;

	public String getPOSTATE() {
		return POSTATE ;
	}

	public void setPOSTATE(Integer poState) {
		switch (poState) {
		case 0:
			POSTATE="请支付起步价";
			break;
		case 1:
			POSTATE = "预约成功";
			break;
		case 2:
			POSTATE = "已申请进入";
			break;
		case 3:
			POSTATE = "正在使用";
			break;
		case 4:
			POSTATE = "未结算的邀约";
			break;
		case 5:
			POSTATE = "等待保安确认离场";
			break;
		case 6:
			POSTATE = "存在延迟费用";
			break;
		case 7:
			POSTATE = "等待保安放行";
			break;
		case 8:
			POSTATE = "费用未结清";
			break;
		case 91:
			POSTATE = "举证信息审核未通过";
			break;
		case 92:
			POSTATE = "举证信息审核中";
			break;
		case 93:
			POSTATE = this.reasonsForRejection;
			break;
		case 94:
			POSTATE = "已退款";
			break;
		case 95:
			POSTATE = "首笔支付超时";
			break;
		case 96:
			POSTATE = "赴约超时";
			break;
		case 97:
			POSTATE = "被占用的邀约";
			break;
		case 98:
			POSTATE = "已完成的邀约";
			break;
		case 99:
			POSTATE="已退款";
			break;
		default:
			break;
		}

	}

	public String getPo_id() {
		return po_id;
	}

	public void setPo_id(String po_id) {
		this.po_id = po_id;
	}

	public String getUserCardId() {
		return userCardId;
	}

	public void setUserCardId(String userCardId) {
		this.userCardId = userCardId;
	}

	public String getParking_id() {
		return parking_id;
	}

	public void setParking_id(String parking_id) {
		this.parking_id = parking_id;
	}

	public String getPup_id() {
		return pup_id;
	}

	public void setPup_id(String pup_id) {
		this.pup_id = pup_id;
	}

	public Date getPoStartTime() {
		return poStartTime;
	}

	public void setPoStartTime(Date poStartTime) {
		this.poStartTime = poStartTime;
	}

	public Date getPoEndTime() {
		return poEndTime;
	}

	public void setPoEndTime(Date poEndTime) {
		this.poEndTime = poEndTime;
	}

	public Date getPoTime() {
		return poTime;
	}

	public void setPoTime(Date poTime) {
		this.poTime = poTime;
	}

	public Integer getPoState() {
		return poState;
	}

	public void setPoState(Integer poState) {
		this.poState = poState;
	}

	public Double getPoLength() {
		return poLength;
	}

	public void setPoLength(Double poLength) {
		this.poLength = poLength;
	}

	public BigDecimal getPoPrice() {
		return poPrice;
	}

	public void setPoPrice(BigDecimal poPrice) {
		this.poPrice = poPrice;
	}

	public Integer getPoVersion() {
		return poVersion;
	}

	public void setPoVersion(Integer poVersion) {
		this.poVersion = poVersion;
	}

	public BigDecimal getPoMoney() {
		return poMoney;
	}

	public void setPoMoney(BigDecimal poMoney) {
		this.poMoney = poMoney;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public Date getFactBeginTime() {
		return factBeginTime;
	}

	public void setFactBeginTime(Date factBeginTime) {
		this.factBeginTime = factBeginTime;
	}

	public Date getFactEndTime() {
		return factEndTime;
	}

	public void setFactEndTime(Date factEndTime) {
		this.factEndTime = factEndTime;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Integer getFine() {
		return fine;
	}

	public void setFine(Integer fine) {
		this.fine = fine;
	}
	
	

	public String getReasonsForRejection() {
		return reasonsForRejection;
	}

	public void setReasonsForRejection(String reasonsForRejection) {
		this.reasonsForRejection = reasonsForRejection;
	}

	public String getWeChatPay() {
		return weChatPay;
	}

	public void setWeChatPay(String weChatPay) {
		this.weChatPay = weChatPay;
	}

	
	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	@Override
	public String toString() {
		return "ParkingOrder [po_id=" + po_id + ", userCardId=" + userCardId + ", parking_id=" + parking_id
				+ ", pup_id=" + pup_id + ", poStartTime=" + poStartTime + ", poEndTime=" + poEndTime + ", poTime="
				+ poTime + ", poState=" + poState + ", poLength=" + poLength + ", poPrice=" + poPrice + ", poVersion="
				+ poVersion + ", poMoney=" + poMoney + ", couponId=" + couponId + ", factBeginTime=" + factBeginTime
				+ ", factEndTime=" + factEndTime + ", total=" + total + ", fine=" + fine + ", delay=" + delay
				+ ", weChatPay=" + weChatPay + ", reasonsForRejection=" + reasonsForRejection + ", formid=" + formid
				+ ", fineMoney=" + fineMoney + ", parkingNum=" + parkingNum + ", parkingLot=" + parkingLot
				+ ", parkingordernum=" + parkingordernum + ", housingEstateId=" + housingEstateId + ", userPhone="
				+ userPhone + ", parkingLot2=" + parkingLot2 + ", housingEstate=" + housingEstate + ", userId=" + userId
				+ ", POSTATE=" + POSTATE + "]";
	}
}
