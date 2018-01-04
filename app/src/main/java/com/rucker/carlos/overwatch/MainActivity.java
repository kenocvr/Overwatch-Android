package com.rucker.carlos.overwatch;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.rucker.carlos.overwatch.api.Client;
import com.rucker.carlos.overwatch.api.Service;
import com.rucker.carlos.overwatch.model.GameStats____;
import com.rucker.carlos.overwatch.model.OverallStats____;
import com.rucker.carlos.overwatch.model.Pojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    public static final String MyPREFERENCES = "myPrefs";
    SharedPreferences sharedpreferences;

    //Todo: Take response/stats and give to List object List<Pojo>
    private ProgressBar progress;
    public static final String EXTRA_MESSAGE = "com.rucker.carlos.overwatch.MESSAGE";
    private Button btnSubmit;
    private EditText battleTag;
    private EditText battleId;
    private TextView sampleTextView;
    public TextView savedBattleTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        savedBattleTag = findViewById(R.id.savedBattleTag);
        progress = findViewById(R.id.pd);
        progress.setVisibility(ProgressBar.INVISIBLE);
        savedBattleTag();
        initViews();

    }

    public void savedBattleTag() {
        SharedPreferences sp = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        final String dummyCheck = sp.getString("battleTagComplete",null);
        if(dummyCheck != null){
            savedBattleTag.setText(dummyCheck);
            savedBattleTag.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

//                    try{
                        Client client = new Client();
                        Service apiService = client
                                .getClient()
                                .create(Service.class);
                        Call<Pojo> call = apiService.getJson(dummyCheck);

                        call.enqueue(new Callback<Pojo>() {
                            @Override
                            public void onResponse(Call<Pojo> call, Response<Pojo> response) {
                                GameStats____ dummy = response.body().getUs().getStats().getCompetitive().getGameStats();
                                OverallStats____ overallStats = response.body().getUs().getStats().getCompetitive().getOverallStats();
                                final String rank = overallStats.getComprank().toString();
                                final String level = overallStats.getLevel().toString();
                                final String winRate = overallStats.getWinRate().toString();
                                final String tier = overallStats.getTier().toString();
                                final String tierImage = overallStats.getTierImage().toString();
                                final String avatar = overallStats.getAvatar().toString();
                                final String damageTotal = dummy.getAllDamageDone().toString();
                                final String eliminationsMostInGame = dummy.getEliminationsMostInGame().toString();

                                //Todo: Create List of stats


                                progress = findViewById(R.id.pd);

                                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                                intent.putExtra("DAMAGE_TOTAL", damageTotal);
                                intent.putExtra("ELIMINATIONS_IN_GAME_TOTAL", eliminationsMostInGame);
                                intent.putExtra("RANK",rank);
                                intent.putExtra("WIN_RATE",winRate);
                                intent.putExtra("TIER",tier);
                                intent.putExtra("LEVEL",level);
                                intent.putExtra("TIER_IMAGE",tierImage);
                                intent.putExtra("AVATAR",avatar);

                                startActivity(intent);
                            }

                            @Override
                            public void onFailure(Call<Pojo> call, Throwable t) {
                                Log.d("Error", t.getMessage());
                                Toast.makeText(MainActivity.this, "Error Fetching Data!", Toast.LENGTH_LONG).show();
                            }
                        });
//                    }catch (Exception e){
//                        Log.d("Error", e.getMessage());
//                    }

                }
            });
        }

    }


    private void initViews() {
        battleTag = (EditText) findViewById(R.id.BattleTag);
        battleId = (EditText) findViewById(R.id.BattleId);
        Typeface owFont = Typeface.createFromAsset(getAssets(), "bignoodletoo.ttf");
        /*CUSTOM ACTIONBAR*/
        ActionBar ab = getActionBar();
        TextView tv = new TextView(getApplicationContext());
        tv.setText("Overwatch  ");
        tv.setTextColor(Color.WHITE);
        tv.setTextScaleX(1.5f);
        tv.setTypeface(owFont);
        ab.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        ab.setCustomView(tv);

        battleTag.setTypeface(owFont);
        battleId.setTypeface(owFont);
        btnSubmit = (Button) findViewById(R.id.btn_submit);
        btnSubmit.setTypeface(owFont);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress.setVisibility(ProgressBar.VISIBLE);
                loadJson();
            }
        });
    }



    private void loadJson(){
        String strBattleTag = battleTag.getText().toString();
        String strBattleId = battleId.getText().toString();
        final String battleTagComplete = strBattleTag+"-"+strBattleId;
        try{
            Client client = new Client();
            Service apiService = client
                    .getClient()
                    .create(Service.class);
            Call<Pojo> call = apiService.getJson(battleTagComplete);
            call.enqueue(new Callback<Pojo>() {
                @Override
                public void onResponse(Call<Pojo> call, Response<Pojo> response) {
                    GameStats____ dummy = response.body().getUs().getStats().getCompetitive().getGameStats();
                    OverallStats____ overallStats = response.body().getUs().getStats().getCompetitive().getOverallStats();
                    final String rank = overallStats.getComprank().toString();
                    final String level = overallStats.getLevel().toString();
                    final String winRate = overallStats.getWinRate().toString();
                    final String tier = overallStats.getTier().toString();
                    final String tierImage = overallStats.getTierImage().toString();
                    final String avatar = overallStats.getAvatar().toString();
                    final String damageTotal = dummy.getAllDamageDone().toString();
                    final String eliminationsMostInGame = dummy.getEliminationsMostInGame().toString();

                    progress = findViewById(R.id.pd);

                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("DAMAGE_TOTAL", damageTotal);
                    intent.putExtra("ELIMINATIONS_IN_GAME_TOTAL", eliminationsMostInGame);
                    intent.putExtra("RANK",rank);
                    intent.putExtra("WIN_RATE",winRate);
                    intent.putExtra("TIER",tier);
                    intent.putExtra("LEVEL",level);
                    intent.putExtra("TIER_IMAGE",tierImage);
                    intent.putExtra("AVATAR",avatar);

                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString("battleTagComplete", battleTagComplete);
                    editor.apply();
                    savedBattleTag.setText(battleTagComplete);

                    startActivity(intent);
                }

                @Override
                public void onFailure(Call<Pojo> call, Throwable t) {
                    Log.d("Error", t.getMessage());
                    Toast.makeText(MainActivity.this, "Error Fetching Data!", Toast.LENGTH_LONG).show();
                }
            });
        }catch (Exception e){
            Log.d("Error", e.getMessage());
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }

    }


}