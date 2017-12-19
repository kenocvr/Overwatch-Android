
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quickplay {

    @SerializedName("average_stats")
    @Expose
    private AverageStats_ averageStats;
    @SerializedName("competitive")
    @Expose
    private Boolean competitive;
    @SerializedName("game_stats")
    @Expose
    private GameStats_ gameStats;
    @SerializedName("overall_stats")
    @Expose
    private OverallStats_ overallStats;
    @SerializedName("rolling_average_stats")
    @Expose
    private RollingAverageStats_ rollingAverageStats;

    public AverageStats_ getAverageStats() {
        return averageStats;
    }

    public void setAverageStats(AverageStats_ averageStats) {
        this.averageStats = averageStats;
    }

    public Boolean getCompetitive() {
        return competitive;
    }

    public void setCompetitive(Boolean competitive) {
        this.competitive = competitive;
    }

    public GameStats_ getGameStats() {
        return gameStats;
    }

    public void setGameStats(GameStats_ gameStats) {
        this.gameStats = gameStats;
    }

    public OverallStats_ getOverallStats() {
        return overallStats;
    }

    public void setOverallStats(OverallStats_ overallStats) {
        this.overallStats = overallStats;
    }

    public RollingAverageStats_ getRollingAverageStats() {
        return rollingAverageStats;
    }

    public void setRollingAverageStats(RollingAverageStats_ rollingAverageStats) {
        this.rollingAverageStats = rollingAverageStats;
    }

}
