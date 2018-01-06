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



        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String damageTotal = extras.getString("DAMAGE_TOTAL");
            String winRate = extras.getString("WIN_RATE");
            String tier = extras.getString("TIER");
            String avatar = extras.getString("AVATAR");
            String tierImage = extras.getString("TIER_IMAGE");
            String level = extras.getString("LEVEL");
            String level00 = level + "00";
            String rank = extras.getString("RANK");
            String eliminationsInGameTotal = extras.getString("ELIMINATIONS_IN_GAME_TOTAL");


            ListItem dmgItem = new ListItem(damageTotal, "Total Damage");


            ListItem winItem = new ListItem(
                    winRate, "Win %"
            );
            ListItem tierItem = new ListItem(
                    tier, "Tier"
            );
            ListItem levelItem = new ListItem(
                    level + level00, "Level"
            );
            ListItem rankItem = new ListItem(
                    rank, "Rank"
            );
            ListItem elimsItem = new ListItem(
                    eliminationsInGameTotal, "Elims in Game Total"
            );
            listItems.add(rankItem);
            listItems.add(tierItem);
            listItems.add(dmgItem);
            listItems.add(winItem);
            listItems.add(tierItem);
            listItems.add(levelItem);
            listItems.add(elimsItem);

            adapter = new ViewAdapter(listItems, this);
            recyclerView.setAdapter(adapter);

        }


    }
}
