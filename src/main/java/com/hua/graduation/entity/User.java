package com.hua.graduation.entity;

import com.hua.graduation.controller.BaseController;

public class User extends BaseController {
    private String userId;
    private String mode;
    private String phone;
    private String email;
    private String createTime;
    private String modifyTime;
    private String password;
    private Short isVip;
    private Short isDeleted;
    private String netName;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setIsVip(Short isVip) {
        this.isVip = isVip;
    }

    public String getPassword() {
        return password;
    }

    public String getNetName() {
        return netName;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public String getMode() {
        return mode;
    }

    public String getCreateTime() {
        return createTime;
    }

    public Short getIsVip() {
        return isVip;
    }

    public Short getIsDeleted() {
        return isDeleted;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUserId() {
        return userId;
    }
}
