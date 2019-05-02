package com.hua.graduation.entity.Search;

/**
 * 用户登录查找类;
 * @author Daniel
 */
public class UserLoginSearch extends BaseSearch {
    private String userId;
    private String startTime;
    private String endTime;
    private String platform;

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getUserId() {
        return userId;
    }

    public String getPlatform() {
        return platform;
    }
}
