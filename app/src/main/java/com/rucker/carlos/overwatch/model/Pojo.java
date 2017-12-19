
package com.rucker.carlos.overwatch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pojo {

    @SerializedName("_request")
    @Expose
    private Request request;
    @SerializedName("any")
    @Expose
    private Object any;
    @SerializedName("eu")
    @Expose
    private Eu eu;
    @SerializedName("kr")
    @Expose
    private Kr kr;
    @SerializedName("us")
    @Expose
    private Us us;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Object getAny() {
        return any;
    }

    public void setAny(Object any) {
        this.any = any;
    }

    public Eu getEu() {
        return eu;
    }

    public void setEu(Eu eu) {
        this.eu = eu;
    }

    public Kr getKr() {
        return kr;
    }

    public void setKr(Kr kr) {
        this.kr = kr;
    }

    public Us getUs() {
        return us;
    }

    public void setUs(Us us) {
        this.us = us;
    }

}
