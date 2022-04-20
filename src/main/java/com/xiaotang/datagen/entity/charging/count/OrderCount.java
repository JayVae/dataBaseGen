package com.xiaotang.datagen.entity.charging.count;

/**
 * @author Administrator 订单统计类
 */
public class OrderCount {

	private Integer wholeOrder;// 全部订单

	private Integer useOrder;// 正在使用的订单

	private Integer completeOrder;// 已完成的订单

	private Integer notUsedOrder;// 未使用的订单

	
	
	
	public OrderCount() {
		super();
	}

	public OrderCount(Integer wholeOrder, Integer useOrder, Integer completeOrder, Integer notUsedOrder) {
		super();
		this.wholeOrder = wholeOrder;
		this.useOrder = useOrder;
		this.completeOrder = completeOrder;
		this.notUsedOrder = notUsedOrder;
	}

	public Integer getWholeOrder() {
		return wholeOrder == null? 0:wholeOrder;
	}

	public void setWholeOrder(Integer wholeOrder) {
		this.wholeOrder = wholeOrder;
	}

	public Integer getUseOrder() {
		return useOrder == null? 0:useOrder;
	}

	public void setUseOrder(Integer useOrder) {
		this.useOrder = useOrder;
	}

	public Integer getCompleteOrder() {
		return completeOrder == null? 0:completeOrder;
	}

	public void setCompleteOrder(Integer completeOrder) {
		this.completeOrder = completeOrder;
	}

	public Integer getNotUsedOrder() {
		return notUsedOrder == null? 0:notUsedOrder;
	}

	public void setNotUsedOrder(Integer notUsedOrder) {
		this.notUsedOrder = notUsedOrder;
	}

	@Override
	public String toString() {
		return "OrderCount [wholeOrder=" + wholeOrder + ", useOrder=" + useOrder + ", completeOrder=" + completeOrder
				+ ", notUsedOrder=" + notUsedOrder + "]";
	}

}
