package com.flowerShop.domain;
/**订单类*/
public class Orders {
	/**订单编号*/
    private int ordersId;
    /**用户名*/
    private String usersName;
    /**价格*/
    private float ordersPrice;
    /**订单日期*/
    private String ordersDatetime;
    /**获得订单编号*/
    public int getOrdersId() {
        return ordersId;
    }
    /**获得价格*/
    public float getOrdersPrice() {
        return ordersPrice;
    }
    /**获得用户名*/
    public String getUsersName() {
		return usersName;
	}

	/**获得订单日期*/
    public String getOrdersDatetime() {
        return ordersDatetime;
    }
    /**设置编号*/
    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }
    /**设置价格*/
    public void setOrdersPrice(float ordersPrice) {
        this.ordersPrice = ordersPrice;
    }
    /**设置日期*/
    public void setOrdersDatetime(String ordersDatetime) {
        this.ordersDatetime = ordersDatetime;
    }
    /**设置用户名*/
	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}
}
