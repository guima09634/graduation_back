package com.hua.graduation.entity;

public class Game extends BaseEntity{
    private String gameCode;
    private String gameName;
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

    public void setGameName(String gameName) {
        this.gameName = gameName;
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

    public String getGameName() {
        return gameName;
    }
}
