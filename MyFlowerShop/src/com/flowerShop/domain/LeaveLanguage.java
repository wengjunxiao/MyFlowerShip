package com.flowerShop.domain;
/**留言类*/
public class LeaveLanguage {
	/**留言编号*/
    private int leaveLanguageId;
    /**姓名*/
    private String name;
    /**QQ号码*/
    private String qq;
    /**邮箱地址*/
    private String email;
    /**留言内容*/
    private String leaveLanguage;
    /**留言时间*/
    private String dateTime;

    /**获得留言编号*/
    public int getLeaveLanguageId() {
        return leaveLanguageId;
    }
    /**获得姓名*/
    public String getName() {
        return name;
    }
    /**获得QQ号码*/
    public String getQq() {
        return qq;
    }
    /**获得邮箱地址*/
    public String getEmail() {
        return email;
    }
    /**获得留言内容*/
    public String getLeaveLanguage() {
        return leaveLanguage;
    }
    /**获得留言时间*/
    public String getDateTime() {
        return dateTime;
    }
    /**设置留言编号*/
    public void setLeaveLanguageId(int leaveLanguageId) {
        this.leaveLanguageId = leaveLanguageId;
    }
    /**设置姓名*/
    public void setName(String name) {
        this.name = name;
    }
    /**设置QQ号码*/
	public void setQq(String qq) {
        this.qq = qq;
    }
	/**设置邮箱地址*/
    public void setEmail(String email) {
        this.email = email;
    }
    /**设置留言内容*/
    public void setLeaveLanguage(String leaveLanguage) {
        this.leaveLanguage = leaveLanguage;
    }
    /**设置留言时间*/
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
