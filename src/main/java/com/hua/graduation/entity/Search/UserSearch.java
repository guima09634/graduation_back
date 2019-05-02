package com.hua.graduation.entity.Search;


/**
 * User查找条件;
 * @author Daniel
 */
public class UserSearch extends BaseSearch{
    private String userId;
    private String mode;
    private String phone;
    private String email;
    private Short timeType;
    private String stratTime;
    private String endTime;
    private Integer startAge;
    private Integer endAge;
    private String sex;
    private String freezeOrDeleted;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEndAge(Integer endAge) {
        this.endAge = endAge;
    }

    public void setStartAge(Integer startAge) {
        this.startAge = startAge;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setStratTime(String stratTime) {
        this.stratTime = stratTime;
    }

    public void setTimeType(Short timeType) {
        this.timeType = timeType;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getUserId() {
        return userId;
    }

    public String getSex() {
        return sex;
    }

    public Integer getEndAge() {
        return endAge;
    }

    public Integer getStartAge() {
        return startAge;
    }

    public Short getTimeType() {
        return timeType;
    }

    public String getStratTime() {
        return stratTime;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getMode() {
        return mode;
    }

    public void setFreezeOrDeleted(String freezeOrDeleted) {
        this.freezeOrDeleted = freezeOrDeleted;
    }

    public String getFreezeOrDeleted() {
        return freezeOrDeleted;
    }
}
