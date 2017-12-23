package com.rucker.carlos.overwatch;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
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


    private ProgressBar progress;
    public static final String EXTRA_MESSAGE = "com.rucker.carlos.overwatch.MESSAGE";
    private Button btnSubmit;
    private EditText battleTag;
    private EditText battleId;
    private TextView sampleTextView;

    public String getBattleTag() {
        battleTag = (EditText) findViewById(R.id.BattleTag);
        return battleTag.toString();
    }

    public String getBattleId() {
        return battleId.getText().toString();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress = findViewById(R.id.pd);
        progress.setVisibility(ProgressBar.INVISIBLE);
        initViews();
    }



    private void initViews() {
        battleTag = (EditText) findViewById(R.id.BattleTag);
        battleId = (EditText) findViewById(R.id.BattleId);
        sampleTextView = (TextView) findViewById(R.id.sampleTestFont);
        Typeface owFont = Typeface.createFromAsset(getAssets(), "bignoodletoo.ttf");
        /*
        *  HOW DO I CUTOMIZE TOOLBAR
        */
        ActionBar ab = getActionBar();

        // Create a TextView programmatically.
        TextView tv = new TextView(getApplicationContext());


        // Set text to display in TextView
        tv.setText("Overwatch  "); // ActionBar title text

        // Set the text color of TextView to black
        tv.setTextColor(Color.WHITE);
        tv.setTextScaleX(1.5f);
        // Set the monospace font for TextView text
        // This will change ActionBar title text font
        tv.setTypeface(owFont);

        // Set the ActionBar display option
        ab.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        // Finally, set the newly created TextView as ActionBar custom view
        ab.setCustomView(tv);



        battleTag.setTypeface(owFont);
        battleId.setTypeface(owFont);
        sampleTextView.setTypeface(owFont);
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

    public void activityStart(String extra){

    }

    private void loadJson(){
        //battleTag = findViewById(R.id.BattleTag);
       // battleId = findViewById(R.id.BattleId);

        String strBattleTag = battleTag.getText().toString();
        String strBattleId = battleId.getText().toString();
        String battleTagComplete = strBattleTag+"-"+strBattleId;
        Log.d("BATTLETAGCOMPLETE::: ", battleTagComplete);
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
