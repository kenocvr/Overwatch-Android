package com.rucker.carlos.overwatch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String someVariable = extras.getString("EXTRA_MESSAGE");
            TextView textView = findViewById(R.id.throwawayText);
            textView.setText(someVariable);
        }

       // String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
       // Log.d("2nd Acticity: onCreate... ", "onCreate && message: "+message);


    }
}
