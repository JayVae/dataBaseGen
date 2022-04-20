package com.xiaotang.datagen.entity.charging;


import java.util.Date;

public class WechatpayRecord {

	private String wechatpayRecordId;// 交易的主键
	private String parkingOrderId;// 订单id
	private String payType;// 交易类型
	private String toTal_fee;// 交易金额
	private String return_code;// 返回状态码
	private String prepayId;//微信支付的凭证
	private Date create_time;//生成时间
	
	

	public String getWechatpayRecordId() {
		return wechatpayRecordId;
	}

	public void setWechatpayRecordId(String wechatpayRecordId) {
		this.wechatpayRecordId = wechatpayRecordId;
	}

	public String getParkingOrderId() {
		return parkingOrderId;
	}

	public void setParkingOrderId(String parkingOrderId) {
		this.parkingOrderId = parkingOrderId;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	
	public String getToTal_fee() {
		return toTal_fee;
	}

	public void setToTal_fee(String toTal_fee) {
		this.toTal_fee = toTal_fee;
	}

	public String getReturn_code() {
		return return_code;
	}

	public void setReturn_code(String return_code) {
		this.return_code = return_code;
	}
	
	
	public String getPrepayId() {
		return prepayId;
	}

	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}

	@Override
	public String toString() {
		return "WechatpayRecord [wechatpayRecordId=" + wechatpayRecordId + ", parkingOrderId=" + parkingOrderId
				+ ", payType=" + payType + ", toTal_fee=" + toTal_fee + ", return_code=" + return_code + ", prepayId="
				+ prepayId + "]";
	}

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
