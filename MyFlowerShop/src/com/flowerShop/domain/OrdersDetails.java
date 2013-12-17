package com.flowerShop.domain;
/**订单详情类*/
public class OrdersDetails {
	/**订单编号*/
	private int ordersId;
	/**货物名称*/
	private String goodsName;
	/**价格*/
	private float goodsPrice;
	/**数量*/
	private int goodsCount;
	/**获得编号*/
	public int getOrdersId() {
	     return ordersId;
	}
	/**获得货物名*/
	public String getGoodsName() {
	     return goodsName;
	}
	/**获得价格*/
	public float getGoodsPrice() {
	     return goodsPrice;
	}
	/**获得数量*/
	public int getGoodsCount() {
	     return goodsCount;
	}
	/**设置编号*/
	public void setOrdersId(int ordersId) {
	     this.ordersId = ordersId;
	}
	/**设置货物名*/
	public void setGoodsName(String goodsName) {
	     this.goodsName = goodsName;
	}
	/**设置货物价格*/
	public void setGoodsPrice(float goodsPrice) {
	     this.goodsPrice = goodsPrice;
	}
	/**设置数量*/
	public void setGoodsCount(int goodsCount) {
	     this.goodsCount = goodsCount;
	}

}
