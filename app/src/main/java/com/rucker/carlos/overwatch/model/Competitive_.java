
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Competitive_ {

    @SerializedName("average_stats")
    @Expose
    private AverageStats__ averageStats;
    @SerializedName("competitive")
    @Expose
    private Boolean competitive;
    @SerializedName("game_stats")
    @Expose
    private GameStats__ gameStats;
    @SerializedName("overall_stats")
    @Expose
    private OverallStats__ overallStats;
    @SerializedName("rolling_average_stats")
    @Expose
    private RollingAverageStats__ rollingAverageStats;

    public AverageStats__ getAverageStats() {
        return averageStats;
    }

    public void setAverageStats(AverageStats__ averageStats) {
        this.averageStats = averageStats;
    }

    public Boolean getCompetitive() {
        return competitive;
    }

    public void setCompetitive(Boolean competitive) {
        this.competitive = competitive;
    }

    public GameStats__ getGameStats() {
        return gameStats;
    }

    public void setGameStats(GameStats__ gameStats) {
        this.gameStats = gameStats;
    }

    public OverallStats__ getOverallStats() {
        return overallStats;
    }

    public void setOverallStats(OverallStats__ overallStats) {
        this.overallStats = overallStats;
    }

    public RollingAverageStats__ getRollingAverageStats() {
        return rollingAverageStats;
    }

    public void setRollingAverageStats(RollingAverageStats__ rollingAverageStats) {
        this.rollingAverageStats = rollingAverageStats;
    }

}
