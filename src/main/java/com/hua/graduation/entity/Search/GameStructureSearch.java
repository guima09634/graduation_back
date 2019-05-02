package com.hua.graduation.entity.Search;

/**
 * 游戏储值特权配置
 * @author Daniel
 */
public class GameStructureSearch extends BaseSearch {
    private String gameName;
    private String startTime;
    private String endTime;
    private String type;

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getGameName() {
        return gameName;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getType() {
        return type;
    }
}
