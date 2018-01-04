package com.rucker.carlos.overwatch;

/**
 * Created by Carlos on 1/4/2018.
 */

public class ListItem {
    private String statType;
    private String statValue;

    public ListItem(String statType, String statValue) {
        this.statType = statType;
        this.statValue = statValue;
    }

    public String getStatType() {
        return statType;
    }

    public String getStatValue() {
        return statValue;
    }

}
