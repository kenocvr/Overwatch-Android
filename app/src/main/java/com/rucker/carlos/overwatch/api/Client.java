package com.rucker.carlos.overwatch.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Carlos on 12/19/2017.
 */

public class Client {

    public static final String BASE_URL = "https://owapi.net/api/v3/u/";


    public static Retrofit retrofit = null;
    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
