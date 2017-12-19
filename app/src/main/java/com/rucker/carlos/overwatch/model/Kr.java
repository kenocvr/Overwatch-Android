
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Kr {

    @SerializedName("stats")
    @Expose
    private Stats_ stats;

    public Stats_ getStats() {
        return stats;
    }

    public void setStats(Stats_ stats) {
        this.stats = stats;
    }

}
