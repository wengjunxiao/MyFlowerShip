package com.flowerShop.domain;
/**������*/
public class Orders {
	/**�������*/
    private int ordersId;
    /**�û���*/
    private String usersName;
    /**�۸�*/
    private float ordersPrice;
    /**��������*/
    private String ordersDatetime;
    /**��ö������*/
    public int getOrdersId() {
        return ordersId;
    }
    /**��ü۸�*/
    public float getOrdersPrice() {
        return ordersPrice;
    }
    /**����û���*/
    public String getUsersName() {
		return usersName;
	}

	/**��ö�������*/
    public String getOrdersDatetime() {
        return ordersDatetime;
    }
    /**���ñ��*/
    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }
    /**���ü۸�*/
    public void setOrdersPrice(float ordersPrice) {
        this.ordersPrice = ordersPrice;
    }
    /**��������*/
    public void setOrdersDatetime(String ordersDatetime) {
        this.ordersDatetime = ordersDatetime;
    }
    /**�����û���*/
	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}
}
