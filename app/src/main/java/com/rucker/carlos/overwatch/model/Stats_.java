
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats_ {

    @SerializedName("competitive")
    @Expose
    private Competitive_ competitive;
    @SerializedName("quickplay")
    @Expose
    private Quickplay_ quickplay;

    public Competitive_ getCompetitive() {
        return competitive;
    }

    public void setCompetitive(Competitive_ competitive) {
        this.competitive = competitive;
    }

    public Quickplay_ getQuickplay() {
        return quickplay;
    }

    public void setQuickplay(Quickplay_ quickplay) {
        this.quickplay = quickplay;
    }

}
