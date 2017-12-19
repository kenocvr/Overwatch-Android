package com.rucker.carlos.overwatch.api;

import com.rucker.carlos.overwatch.model.Pojo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Carlos on 12/18/2017.
 */

public interface Service {

    // Endpoint https://owapi.net/api/v3/u/ThistleFoot-11552/stats
    /*
        https://owapi.net/api/v3/u/{battleTag}-{battleId}/stats
    */

    // battleTagComplete is the concat of battleTag and battleId

    @GET("ThistleFoot-11552/stats")
    Call<Pojo> getJson();

//    @GET("{battleTagComplete}/stats")
//    Call<Pojo> getJson(@Path("battleTagComplete") String battleTagComplete);


}
