package com.flowerShop.domain;
/**������*/
public class LeaveLanguage {
	/**���Ա��*/
    private int leaveLanguageId;
    /**����*/
    private String name;
    /**QQ����*/
    private String qq;
    /**�����ַ*/
    private String email;
    /**��������*/
    private String leaveLanguage;
    /**����ʱ��*/
    private String dateTime;

    /**������Ա��*/
    public int getLeaveLanguageId() {
        return leaveLanguageId;
    }
    /**�������*/
    public String getName() {
        return name;
    }
    /**���QQ����*/
    public String getQq() {
        return qq;
    }
    /**��������ַ*/
    public String getEmail() {
        return email;
    }
    /**�����������*/
    public String getLeaveLanguage() {
        return leaveLanguage;
    }
    /**�������ʱ��*/
    public String getDateTime() {
        return dateTime;
    }
    /**�������Ա��*/
    public void setLeaveLanguageId(int leaveLanguageId) {
        this.leaveLanguageId = leaveLanguageId;
    }
    /**��������*/
    public void setName(String name) {
        this.name = name;
    }
    /**����QQ����*/
	public void setQq(String qq) {
        this.qq = qq;
    }
	/**���������ַ*/
    public void setEmail(String email) {
        this.email = email;
    }
    /**������������*/
    public void setLeaveLanguage(String leaveLanguage) {
        this.leaveLanguage = leaveLanguage;
    }
    /**��������ʱ��*/
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
