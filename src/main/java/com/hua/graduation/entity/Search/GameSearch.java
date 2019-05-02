package com.hua.graduation.entity.Search;

/**
 * 游戏查找类
 * @author Daniel
 */
public class GameSearch extends BaseSearch {
    private String gameName;
    private String startTime;
    private String endTime;
    private String mode;

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getGameName() {
        return gameName;
    }

    public String getMode() {
        return mode;
    }
}
