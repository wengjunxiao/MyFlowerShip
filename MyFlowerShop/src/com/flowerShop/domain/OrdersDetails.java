package com.flowerShop.domain;
/**����������*/
public class OrdersDetails {
	/**�������*/
	private int ordersId;
	/**��������*/
	private String goodsName;
	/**�۸�*/
	private float goodsPrice;
	/**����*/
	private int goodsCount;
	/**��ñ��*/
	public int getOrdersId() {
	     return ordersId;
	}
	/**��û�����*/
	public String getGoodsName() {
	     return goodsName;
	}
	/**��ü۸�*/
	public float getGoodsPrice() {
	     return goodsPrice;
	}
	/**�������*/
	public int getGoodsCount() {
	     return goodsCount;
	}
	/**���ñ��*/
	public void setOrdersId(int ordersId) {
	     this.ordersId = ordersId;
	}
	/**���û�����*/
	public void setGoodsName(String goodsName) {
	     this.goodsName = goodsName;
	}
	/**���û���۸�*/
	public void setGoodsPrice(float goodsPrice) {
	     this.goodsPrice = goodsPrice;
	}
	/**��������*/
	public void setGoodsCount(int goodsCount) {
	     this.goodsCount = goodsCount;
	}

}
