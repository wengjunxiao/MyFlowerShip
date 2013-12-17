package com.flowerShop.domain;
/**日志类*/
public class SafeLog
{
	/**日志编号*/
    private int logId;
    /**用户名*/
    private String usersId;
    /**登录IP*/
    private String landingIp;
    /**登录时间*/
    private String landingDatetime;
    /**退出时间*/
    private String exitDatetime;
    /**获得日志编号*/
    public int getLogId() {
        return logId;
    }
    /**获得用户名*/
    public String getUsersId() {
        return usersId;
    }
    /**获得IP*/
    public String getLandingIp() {
        return landingIp;
    }
    /**获得登录时间*/
    public String getLandingDatetime() {
        return landingDatetime;
    }
    /**获得退出时间*/
    public String getExitDatetime() {
        return exitDatetime;
    }
    /**设置编号*/
    public void setLogId(int logId) {
        this.logId = logId;
    }
    /**设置用户名*/
    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }
    /**设置登录IP*/
    public void setLandingIp(String landingIp) {
        this.landingIp = landingIp;
    }
    /**设置登录时间*/
    public void setLandingDatetime(String landingDatetime) {
        this.landingDatetime = landingDatetime;
    }
    /**设置退出时间*/
    public void setExitDatetime(String exitDatetime) {
        this.exitDatetime = exitDatetime;
    }
}
