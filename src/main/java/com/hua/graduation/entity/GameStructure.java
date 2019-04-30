package com.hua.graduation.entity;

public class GameStructure extends BaseEntity{
    private String gameCode;
    private String structure;
    private String createTime;
    private String modifyTime;
    private Short isDeleted;

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getGameCode() {
        return gameCode;
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

    public String getStructure() {
        return structure;
    }
}
