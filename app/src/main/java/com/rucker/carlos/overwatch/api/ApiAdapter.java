package com.rucker.carlos.overwatch.api;

import android.util.Log;

import com.rucker.carlos.overwatch.MainActivity;
import com.rucker.carlos.overwatch.model.GameStats____;
import com.rucker.carlos.overwatch.model.OverallStats____;
import com.rucker.carlos.overwatch.model.Pojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Carlos on 12/25/2017.
 */

public class ApiAdapter extends MainActivity{

    public String rank;
    public String elims;
    public String avatar;
    public String damage;
    public String tier;
    public String tierImage;
    public String winRate;
    public String level;


    public void apiCaller(String endpoint){

        try{
            Client client = new Client();
            final Service apiService = client
                    .getClient()
                    .create(Service.class);
            Call<Pojo> call = apiService.getJson(endpoint);
            call.enqueue(new Callback<Pojo>() {
                @Override
                public void onResponse(Call<Pojo> call, Response<Pojo> response) {
                    GameStats____ dummy = response.body().getUs().getStats().getCompetitive().getGameStats();
                    OverallStats____ overallStats = response.body().getUs().getStats().getCompetitive().getOverallStats();

                    elims = dummy.getEliminationsMostInGame().toString();
                    pullOutElimsMostInGame(elims);

                    rank = overallStats.getComprank().toString();
                    pullOutRank(rank);

                    damage = dummy.getAllDamageDoneMostInGame().toString();
                    pullOutDmgMostInGame(damage);

                    level = overallStats.getComprank().toString();
                    pullOutLevel(level);

                    tier = overallStats.getTier().toString();
                    pullOutTier(tier);

                    avatar = overallStats.getAvatar().toString();
                    pullOutAvatar(avatar);

                    winRate = overallStats.getWinRate().toString();
                    pullOutWinRate(winRate);

                }


                @Override
                public void onFailure(Call<Pojo> call, Throwable t) {
                    Log.d("Error", t.getMessage());
                }
            });


        }catch (Exception e){
            Log.d("Error", e.getMessage());
        }
    }

    public void pullOutDummy(Response<Pojo> dummy) {
       // String elimAdapter = dummy.getEliminationsMostInGame().toString();

    }
    public void pullOutDmgMostInGame(String damage){
        this.damage = damage;
        //return damage;
    }

    public String passDmgMostInGame(){
        return damage;
    }
    public void pullOutElimsMostInGame(String elims){
        this.elims = elims;
        //return elims;
    }
    public String passElimsMostInGame(){
        return elims;
    }
    public void pullOutRank(String rank){
        this.rank = rank;
       //return rank;
    }
    public String passRank(){
        return rank;
    }

    public void pullOutLevel(String level){
        this.level = level;
        //return level;
    }
    public String passLevel(){
        return level;
    }

    public void pullOutWinRate(String winRate){
        this.winRate = winRate;
        //return winRate;
    }
    public String passWinRate(){
        return winRate;
    }
    public void pullOutTier(String tier){
        this.tier = tier;
    }
    public String passTier(){
        return tier;
    }
    public String pullOutTierImage(){
        OverallStats____ ovStats = new OverallStats____();
        String tierImageAdapter = ovStats.getTierImage();
        return tierImageAdapter;
    }
    public void pullOutAvatar(String avatar){
        this.avatar = avatar;
    }
    public String passAvatar(){
        return avatar;
    }

}
