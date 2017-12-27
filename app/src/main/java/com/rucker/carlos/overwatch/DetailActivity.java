package com.rucker.carlos.overwatch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends Activity {

    //Todo: move api call to DetailActivity.
    //Todo: Parent activity to pass BattleTag to DetailActivity as intent extra.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String damageTotal = extras.getString("DAMAGE_TOTAL");
            String winRate = extras.getString("WIN_RATE");
            String tier = extras.getString("TIER");
            //String avatar = extras.getString("AVATAR");
            //String tierImage = extras.getString("TIER_IMAGE");
            String level = extras.getString("LEVEL");
            String level00 = level + "00";
            String rank = extras.getString("RANK");
            TextView tvDamageTotal = findViewById(R.id.total_damage);
            tvDamageTotal.setText(damageTotal);

            String eliminationsInGameTotal = extras.getString("ELIMINATIONS_IN_GAME_TOTAL");
            TextView tvEliminationsInGameTotal = findViewById(R.id.in_game_elims_total);
            tvEliminationsInGameTotal.setText(eliminationsInGameTotal);

            TextView tvWinrate = findViewById(R.id.win_rate);
            tvWinrate.setText(winRate);

            TextView tvTier = findViewById(R.id.tier);
            tvTier.setText(tier);

            TextView tvLevel = findViewById(R.id.level);
            tvLevel.setText(level00);

            TextView tvRank = findViewById(R.id.rank);
            tvRank.setText(rank);

        }

       // String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
       // Log.d("2nd Acticity: onCreate... ", "onCreate && message: "+message);


    }
}
