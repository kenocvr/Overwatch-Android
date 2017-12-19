
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats__ {

    @SerializedName("competitive")
    @Expose
    private Competitive__ competitive;
    @SerializedName("quickplay")
    @Expose
    private Quickplay__ quickplay;

    public Competitive__ getCompetitive() {
        return competitive;
    }

    public void setCompetitive(Competitive__ competitive) {
        this.competitive = competitive;
    }

    public Quickplay__ getQuickplay() {
        return quickplay;
    }

    public void setQuickplay(Quickplay__ quickplay) {
        this.quickplay = quickplay;
    }

}
