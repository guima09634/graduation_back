package com.hua.graduation.entity;

public class UserLogin extends BaseEntity {
    private String userId;
    private String loginTime;
    private String platform;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getUserId() {
        return userId;
    }

    public String getPlatform() {
        return platform;
    }

    public String getLoginTime() {
        return loginTime;
    }
}
