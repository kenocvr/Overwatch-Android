
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quickplay__ {

    @SerializedName("average_stats")
    @Expose
    private AverageStats_____ averageStats;
    @SerializedName("competitive")
    @Expose
    private Boolean competitive;
    @SerializedName("game_stats")
    @Expose
    private GameStats_____ gameStats;
    @SerializedName("overall_stats")
    @Expose
    private OverallStats_____ overallStats;
    @SerializedName("rolling_average_stats")
    @Expose
    private RollingAverageStats_____ rollingAverageStats;

    public AverageStats_____ getAverageStats() {
        return averageStats;
    }

    public void setAverageStats(AverageStats_____ averageStats) {
        this.averageStats = averageStats;
    }

    public Boolean getCompetitive() {
        return competitive;
    }

    public void setCompetitive(Boolean competitive) {
        this.competitive = competitive;
    }

    public GameStats_____ getGameStats() {
        return gameStats;
    }

    public void setGameStats(GameStats_____ gameStats) {
        this.gameStats = gameStats;
    }

    public OverallStats_____ getOverallStats() {
        return overallStats;
    }

    public void setOverallStats(OverallStats_____ overallStats) {
        this.overallStats = overallStats;
    }

    public RollingAverageStats_____ getRollingAverageStats() {
        return rollingAverageStats;
    }

    public void setRollingAverageStats(RollingAverageStats_____ rollingAverageStats) {
        this.rollingAverageStats = rollingAverageStats;
    }

}
