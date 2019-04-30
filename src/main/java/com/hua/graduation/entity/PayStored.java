package com.hua.graduation.entity;

public class PayStored extends BaseEntity {
    private String usersId;
    private String creditId;
    private String gameCode;
    private String platform;
    private Double amout;
    private String createTime;
    private String modifyTime;
    private Short isDeleted;

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    public void setAmout(Double amout) {
        this.amout = amout;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public Short getIsDeleted() {
        return isDeleted;
    }

    public String getGameCode() {
        return gameCode;
    }

    public String getPlatform() {
        return platform;
    }

    public String getUsersId() {
        return usersId;
    }

    public String getCreditId() {
        return creditId;
    }

    public Double getAmout() {
        return amout;
    }
}
