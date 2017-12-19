
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("api_ver")
    @Expose
    private Integer apiVer;
    @SerializedName("route")
    @Expose
    private String route;

    public Integer getApiVer() {
        return apiVer;
    }

    public void setApiVer(Integer apiVer) {
        this.apiVer = apiVer;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

}
