package com.flowerShop.domain;
/**��־��*/
public class SafeLog
{
	/**��־���*/
    private int logId;
    /**�û���*/
    private String usersId;
    /**��¼IP*/
    private String landingIp;
    /**��¼ʱ��*/
    private String landingDatetime;
    /**�˳�ʱ��*/
    private String exitDatetime;
    /**�����־���*/
    public int getLogId() {
        return logId;
    }
    /**����û���*/
    public String getUsersId() {
        return usersId;
    }
    /**���IP*/
    public String getLandingIp() {
        return landingIp;
    }
    /**��õ�¼ʱ��*/
    public String getLandingDatetime() {
        return landingDatetime;
    }
    /**����˳�ʱ��*/
    public String getExitDatetime() {
        return exitDatetime;
    }
    /**���ñ��*/
    public void setLogId(int logId) {
        this.logId = logId;
    }
    /**�����û���*/
    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }
    /**���õ�¼IP*/
    public void setLandingIp(String landingIp) {
        this.landingIp = landingIp;
    }
    /**���õ�¼ʱ��*/
    public void setLandingDatetime(String landingDatetime) {
        this.landingDatetime = landingDatetime;
    }
    /**�����˳�ʱ��*/
    public void setExitDatetime(String exitDatetime) {
        this.exitDatetime = exitDatetime;
    }
}
