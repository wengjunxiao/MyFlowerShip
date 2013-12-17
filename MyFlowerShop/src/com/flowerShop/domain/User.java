package com.flowerShop.domain;
/**用户类*/
public class User implements java.io.Serializable
{
	/**用户编号*/
    private int usersId;
    /**用户名*/
    private String usersName;
    /**密码*/
    private String usersPass;
    /**密码问题*/
    private String usersPassQuestion;
    /**问题答案*/
    private String usersPassReply;
    /**真实姓名*/
    private String usersTrueName;
    /**家庭地址*/
    private String usersAddress;
    /**电话号码*/
    private String usersPhone;
    /**邮件地址*/
    private String usersE_mail;
    /**获得用户编号*/
    public int getUsersId() {
        return usersId;
    }
    /**获得用户名*/
    public String getUsersName() {
        return usersName;
    }
    /**获得密码*/
    public String getUsersPass() {
        return usersPass;
    }
    /**获得密码问题*/
    public String getUsersPassQuestion() {
        return usersPassQuestion;
    }
    /**获得答案*/
    public String getUsersPassReply() {
        return usersPassReply;
    }
    /**获得真实姓名*/
    public String getUsersTrueName() {
        return usersTrueName;
    }
    /**获得地址*/
    public String getUsersAddress() {
        return usersAddress;
    }
    /**获得用户电话*/
    public String getUsersPhone() {
        return usersPhone;
    }
    /**获得电子邮箱*/
    public String getUsersE_mail() {
        return usersE_mail;
    }	
    /**设置用户编号*/
    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }
    /**设置用户名*/
    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }
    /**设置用户密码*/
    public void setUsersPass(String usersPass) {
        this.usersPass = usersPass;
    }
    /**设置密码问题*/
    public void setUsersPassQuestion(String usersPassQuestion) {
        this.usersPassQuestion = usersPassQuestion;
    }
    /**设置问题答案*/
    public void setUsersPassReply(String usersPassReply) {
        this.usersPassReply = usersPassReply;
    }
    /**设置真实姓名*/
    public void setUsersTrueName(String usersTrueName) {
        this.usersTrueName = usersTrueName;
    }
    /**设置用户地址*/
    public void setUsersAddress(String usersAddress) {
        this.usersAddress = usersAddress;
    }
    /**设置用户电话*/
    public void setUsersPhone(String usersPhone) {
        this.usersPhone = usersPhone;
    }
    /**设置用户邮箱*/
    public void setUsersE_mail(String usersE_mail) {
        this.usersE_mail = usersE_mail;
    }

}
