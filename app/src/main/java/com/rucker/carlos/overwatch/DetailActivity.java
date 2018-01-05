package com.rucker.carlos.overwatch;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends Activity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<ListItem> listItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView. setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listItems = new ArrayList<>();

        //Todo: create a collection of listItems.
        //Todo: loop through collection of listItems.
        // Todo: use the listItems.add(<i>)

        for(int i = 0; i <=10; i++){
            ListItem listItem = new ListItem(
                    "heading" +(i+1),
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            );
            listItems.add(listItem);
        }
        adapter = new ViewAdapter(listItems, this);
        recyclerView.setAdapter(adapter);

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
//            TextView tvDamageTotal = findViewById(R.id.total_damage);
//            tvDamageTotal.setText(damageTotal);

            String eliminationsInGameTotal = extras.getString("ELIMINATIONS_IN_GAME_TOTAL");
//            TextView tvEliminationsInGameTotal = findViewById(R.id.in_game_elims_total);
//            tvEliminationsInGameTotal.setText(eliminationsInGameTotal);

//            TextView tvWinrate = findViewById(R.id.win_rate);
//            tvWinrate.setText(winRate);

//            TextView tvTier = findViewById(R.id.tier);
//            tvTier.setText(tier);

//            TextView tvLevel = findViewById(R.id.level);
//            tvLevel.setText(level00);

//            TextView tvRank = findViewById(R.id.rank);
//            tvRank.setText(rank);

        }


    }
}
