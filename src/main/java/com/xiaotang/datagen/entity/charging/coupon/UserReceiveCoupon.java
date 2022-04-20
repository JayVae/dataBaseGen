package com.xiaotang.datagen.entity.charging.coupon;



import java.math.BigDecimal;
import java.util.Date;


/**
 * @author Administrator
 *
 */

/**
 * @author Administrator
 *
 */
public class UserReceiveCoupon {

	private String userReceiveCouponBitId;

	private String couponDetId;

	private Date overdueDate;

	private Integer useState;

	private Integer version;

	private String userId;
	
	private BigDecimal fullMoney;
	
	private BigDecimal reduceMoney;
	
	private Double discount;
	
	private BigDecimal discountedMoney;
	
	private String couponName;

	public String getUserReceiveCouponBitId() {
		return userReceiveCouponBitId;
	}

	public void setUserReceiveCouponBitId(String userReceiveCouponBitId) {
		this.userReceiveCouponBitId = userReceiveCouponBitId;
	}

	public String getCouponDetId() {
		return couponDetId;
	}

	public void setCouponDetId(String couponDetId) {
		this.couponDetId = couponDetId;
	}

	public Date getOverdueDate() {
		return overdueDate;
	}

	public void setOverdueDate(Date overdueDate) {
		this.overdueDate = overdueDate;
	}

	public Integer getUseState() {
		return useState;
	}

	public void setUseState(Integer useState) {
		this.useState = useState;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public BigDecimal getFullMoney() {
		return fullMoney;
	}

	public void setFullMoney(BigDecimal fullMoney) {
		this.fullMoney = fullMoney;
	}

	public BigDecimal getReduceMoney() {
		return reduceMoney;
	}

	public void setReduceMoney(BigDecimal reduceMoney) {
		this.reduceMoney = reduceMoney;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public BigDecimal getDiscountedMoney() {
		return discountedMoney;
	}

	public void setDiscountedMoney(BigDecimal discountedMoney) {
		this.discountedMoney = discountedMoney;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	@Override
	public String toString() {
		return "UserReceiveCoupon [userReceiveCouponBitId=" + userReceiveCouponBitId + ", couponDetId=" + couponDetId
				+ ", overdueDate=" + overdueDate + ", useState=" + useState + ", version=" + version + ", userId="
				+ userId + ", fullMoney=" + fullMoney + ", reduceMoney=" + reduceMoney + ", discount=" + discount
				+ ", discountedMoney=" + discountedMoney + ", couponName=" + couponName + "]";
	}
}
