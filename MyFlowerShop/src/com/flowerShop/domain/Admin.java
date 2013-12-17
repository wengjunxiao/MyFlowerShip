package com.flowerShop.domain;

/**管理员类*/
public class Admin {
	/**管理员编号*/
	private int adminId;
	/**管理员账号*/
	private String adminName;
	/**管理员密码*/
	private String adminPass;
	/**获得序号*/
	public int getAdminId() {
		return adminId;
	}
	/**设置序号*/
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	/**获得管理员账号*/
	public String getAdminName() {
		return adminName;
	}
	/**设置管理员账号*/
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	/**获得管理员密码*/
	public String getAdminPass() {
		return adminPass;
	}
	/**设置管理员密码*/
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	
}
