
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OverallStats____ {

    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("comprank")
    @Expose
    private Integer comprank;
    @SerializedName("games")
    @Expose
    private Integer games;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("losses")
    @Expose
    private Integer losses;
    @SerializedName("prestige")
    @Expose
    private Integer prestige;
    @SerializedName("rank_image")
    @Expose
    private String rankImage;
    @SerializedName("tier")
    @Expose
    private String tier;
    @SerializedName("tier_image")
    @Expose
    private String tierImage;
    @SerializedName("ties")
    @Expose
    private Integer ties;
    @SerializedName("win_rate")
    @Expose
    private Double winRate;
    @SerializedName("wins")
    @Expose
    private Integer wins;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getComprank() {
        return comprank;
    }

    public void setComprank(Integer comprank) {
        this.comprank = comprank;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getPrestige() {
        return prestige;
    }

    public void setPrestige(Integer prestige) {
        this.prestige = prestige;
    }

    public String getRankImage() {
        return rankImage;
    }

    public void setRankImage(String rankImage) {
        this.rankImage = rankImage;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getTierImage() {
        return tierImage;
    }

    public void setTierImage(String tierImage) {
        this.tierImage = tierImage;
    }

    public Integer getTies() {
        return ties;
    }

    public void setTies(Integer ties) {
        this.ties = ties;
    }

    public Double getWinRate() {
        return winRate;
    }

    public void setWinRate(Double winRate) {
        this.winRate = winRate;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

}
