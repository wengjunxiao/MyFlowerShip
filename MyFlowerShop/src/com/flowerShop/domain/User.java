package com.flowerShop.domain;
/**�û���*/
public class User implements java.io.Serializable
{
	/**�û����*/
    private int usersId;
    /**�û���*/
    private String usersName;
    /**����*/
    private String usersPass;
    /**��������*/
    private String usersPassQuestion;
    /**�����*/
    private String usersPassReply;
    /**��ʵ����*/
    private String usersTrueName;
    /**��ͥ��ַ*/
    private String usersAddress;
    /**�绰����*/
    private String usersPhone;
    /**�ʼ���ַ*/
    private String usersE_mail;
    /**����û����*/
    public int getUsersId() {
        return usersId;
    }
    /**����û���*/
    public String getUsersName() {
        return usersName;
    }
    /**�������*/
    public String getUsersPass() {
        return usersPass;
    }
    /**�����������*/
    public String getUsersPassQuestion() {
        return usersPassQuestion;
    }
    /**��ô�*/
    public String getUsersPassReply() {
        return usersPassReply;
    }
    /**�����ʵ����*/
    public String getUsersTrueName() {
        return usersTrueName;
    }
    /**��õ�ַ*/
    public String getUsersAddress() {
        return usersAddress;
    }
    /**����û��绰*/
    public String getUsersPhone() {
        return usersPhone;
    }
    /**��õ�������*/
    public String getUsersE_mail() {
        return usersE_mail;
    }	
    /**�����û����*/
    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }
    /**�����û���*/
    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }
    /**�����û�����*/
    public void setUsersPass(String usersPass) {
        this.usersPass = usersPass;
    }
    /**������������*/
    public void setUsersPassQuestion(String usersPassQuestion) {
        this.usersPassQuestion = usersPassQuestion;
    }
    /**���������*/
    public void setUsersPassReply(String usersPassReply) {
        this.usersPassReply = usersPassReply;
    }
    /**������ʵ����*/
    public void setUsersTrueName(String usersTrueName) {
        this.usersTrueName = usersTrueName;
    }
    /**�����û���ַ*/
    public void setUsersAddress(String usersAddress) {
        this.usersAddress = usersAddress;
    }
    /**�����û��绰*/
    public void setUsersPhone(String usersPhone) {
        this.usersPhone = usersPhone;
    }
    /**�����û�����*/
    public void setUsersE_mail(String usersE_mail) {
        this.usersE_mail = usersE_mail;
    }

}
