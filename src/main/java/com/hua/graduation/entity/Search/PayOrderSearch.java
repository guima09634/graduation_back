package com.hua.graduation.entity.Search;

/**
 *订单查找类
 * @author Daniel
 */
public class PayOrderSearch  extends BaseSearch{
    private String userId;
    private String creditId;
    private String platform;
    private Double startAmout;
    private Double endAmount;
    private String startTime;
    private String endTime;

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    public void setEndAmount(Double endAmount) {
        this.endAmount = endAmount;
    }

    public void setStartAmout(Double startAmout) {
        this.startAmout = startAmout;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getPlatform() {
        return platform;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getUserId() {
        return userId;
    }

    public String getCreditId() {
        return creditId;
    }

    public Double getEndAmount() {
        return endAmount;
    }

    public Double getStartAmout() {
        return startAmout;
    }
}
