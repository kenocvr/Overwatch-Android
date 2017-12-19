
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quickplay_ {

    @SerializedName("average_stats")
    @Expose
    private AverageStats___ averageStats;
    @SerializedName("competitive")
    @Expose
    private Boolean competitive;
    @SerializedName("game_stats")
    @Expose
    private GameStats___ gameStats;
    @SerializedName("overall_stats")
    @Expose
    private OverallStats___ overallStats;
    @SerializedName("rolling_average_stats")
    @Expose
    private RollingAverageStats___ rollingAverageStats;

    public AverageStats___ getAverageStats() {
        return averageStats;
    }

    public void setAverageStats(AverageStats___ averageStats) {
        this.averageStats = averageStats;
    }

    public Boolean getCompetitive() {
        return competitive;
    }

    public void setCompetitive(Boolean competitive) {
        this.competitive = competitive;
    }

    public GameStats___ getGameStats() {
        return gameStats;
    }

    public void setGameStats(GameStats___ gameStats) {
        this.gameStats = gameStats;
    }

    public OverallStats___ getOverallStats() {
        return overallStats;
    }

    public void setOverallStats(OverallStats___ overallStats) {
        this.overallStats = overallStats;
    }

    public RollingAverageStats___ getRollingAverageStats() {
        return rollingAverageStats;
    }

    public void setRollingAverageStats(RollingAverageStats___ rollingAverageStats) {
        this.rollingAverageStats = rollingAverageStats;
    }

}
