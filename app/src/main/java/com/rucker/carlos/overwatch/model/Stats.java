
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("competitive")
    @Expose
    private Competitive competitive;
    @SerializedName("quickplay")
    @Expose
    private Quickplay quickplay;

    public Competitive getCompetitive() {
        return competitive;
    }

    public void setCompetitive(Competitive competitive) {
        this.competitive = competitive;
    }

    public Quickplay getQuickplay() {
        return quickplay;
    }

    public void setQuickplay(Quickplay quickplay) {
        this.quickplay = quickplay;
    }

}
