package com.rucker.carlos.overwatch.api;

import com.rucker.carlos.overwatch.model.Pojo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Carlos on 12/18/2017.
 */

public interface Service {


    @GET("ThistleFoot-11552/stats")
    Call<Pojo> getJson();

    @GET("{battleTagComplete}/stats")
    Call<Pojo> getJson(@Path("battleTagComplete") String battleTagComplete);


}
