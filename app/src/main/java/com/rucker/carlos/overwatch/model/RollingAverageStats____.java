
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RollingAverageStats____ {

    @SerializedName("all_damage_done")
    @Expose
    private Double allDamageDone;
    @SerializedName("barrier_damage_done")
    @Expose
    private Double barrierDamageDone;
    @SerializedName("deaths")
    @Expose
    private Double deaths;
    @SerializedName("eliminations")
    @Expose
    private Double eliminations;
    @SerializedName("final_blows")
    @Expose
    private Double finalBlows;
    @SerializedName("healing_done")
    @Expose
    private Double healingDone;
    @SerializedName("hero_damage_done")
    @Expose
    private Double heroDamageDone;
    @SerializedName("objective_kills")
    @Expose
    private Double objectiveKills;
    @SerializedName("objective_time")
    @Expose
    private Double objectiveTime;
    @SerializedName("solo_kills")
    @Expose
    private Double soloKills;
    @SerializedName("time_spent_on_fire")
    @Expose
    private Double timeSpentOnFire;

    public Double getAllDamageDone() {
        return allDamageDone;
    }

    public void setAllDamageDone(Double allDamageDone) {
        this.allDamageDone = allDamageDone;
    }

    public Double getBarrierDamageDone() {
        return barrierDamageDone;
    }

    public void setBarrierDamageDone(Double barrierDamageDone) {
        this.barrierDamageDone = barrierDamageDone;
    }

    public Double getDeaths() {
        return deaths;
    }

    public void setDeaths(Double deaths) {
        this.deaths = deaths;
    }

    public Double getEliminations() {
        return eliminations;
    }

    public void setEliminations(Double eliminations) {
        this.eliminations = eliminations;
    }

    public Double getFinalBlows() {
        return finalBlows;
    }

    public void setFinalBlows(Double finalBlows) {
        this.finalBlows = finalBlows;
    }

    public Double getHealingDone() {
        return healingDone;
    }

    public void setHealingDone(Double healingDone) {
        this.healingDone = healingDone;
    }

    public Double getHeroDamageDone() {
        return heroDamageDone;
    }

    public void setHeroDamageDone(Double heroDamageDone) {
        this.heroDamageDone = heroDamageDone;
    }

    public Double getObjectiveKills() {
        return objectiveKills;
    }

    public void setObjectiveKills(Double objectiveKills) {
        this.objectiveKills = objectiveKills;
    }

    public Double getObjectiveTime() {
        return objectiveTime;
    }

    public void setObjectiveTime(Double objectiveTime) {
        this.objectiveTime = objectiveTime;
    }

    public Double getSoloKills() {
        return soloKills;
    }

    public void setSoloKills(Double soloKills) {
        this.soloKills = soloKills;
    }

    public Double getTimeSpentOnFire() {
        return timeSpentOnFire;
    }

    public void setTimeSpentOnFire(Double timeSpentOnFire) {
        this.timeSpentOnFire = timeSpentOnFire;
    }

}
