
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Competitive__ {

    @SerializedName("average_stats")
    @Expose
    private AverageStats____ averageStats;
    @SerializedName("competitive")
    @Expose
    private Boolean competitive;
    @SerializedName("game_stats")
    @Expose
    private GameStats____ gameStats;
    @SerializedName("overall_stats")
    @Expose
    private OverallStats____ overallStats;
    @SerializedName("rolling_average_stats")
    @Expose
    private RollingAverageStats____ rollingAverageStats;

    public AverageStats____ getAverageStats() {
        return averageStats;
    }

    public void setAverageStats(AverageStats____ averageStats) {
        this.averageStats = averageStats;
    }

    public Boolean getCompetitive() {
        return competitive;
    }

    public void setCompetitive(Boolean competitive) {
        this.competitive = competitive;
    }

    public GameStats____ getGameStats() {
        return gameStats;
    }

    public void setGameStats(GameStats____ gameStats) {
        this.gameStats = gameStats;
    }

    public OverallStats____ getOverallStats() {
        return overallStats;
    }

    public void setOverallStats(OverallStats____ overallStats) {
        this.overallStats = overallStats;
    }

    public RollingAverageStats____ getRollingAverageStats() {
        return rollingAverageStats;
    }

    public void setRollingAverageStats(RollingAverageStats____ rollingAverageStats) {
        this.rollingAverageStats = rollingAverageStats;
    }

}
