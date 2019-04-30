package com.hua.graduation.entity;

/**
 * 用户信息类；
 * @author Daniel
 */
public class UserInfo extends BaseEntity{
    private String usersId;
    private int age;
    private String sex;
    private String address;
    private String createTime;
    private String modifyTime;
    private Short isDeleted;

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }

    public Short getIsDeleted() {
        return isDeleted;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getUsersId() {
        return usersId;
    }
}
