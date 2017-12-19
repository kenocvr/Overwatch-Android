
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Us {

    @SerializedName("stats")
    @Expose
    private Stats__ stats;

    public Stats__ getStats() {
        return stats;
    }

    public void setStats(Stats__ stats) {
        this.stats = stats;
    }

}
