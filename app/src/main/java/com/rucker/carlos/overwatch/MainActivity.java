package com.rucker.carlos.overwatch;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rucker.carlos.overwatch.api.Client;
import com.rucker.carlos.overwatch.api.Service;
import com.rucker.carlos.overwatch.model.Pojo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    private Button btnSubmit;
    private EditText battleTag;
    private EditText battleId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        btnSubmit = (Button) findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MAUMAUUUU:::: ", "onClick: CLICKITY");
                loadJson();
            }
        });
    }

    private void loadJson(){
        try{
            Client client = new Client();
            Service apiService = client
                    .getClient()
                    .create(Service.class);
            Call<Pojo> call = apiService.getJson();

            call.enqueue(new Callback<Pojo>() {
                @Override
                public void onResponse(Call<Pojo> call, Response<Pojo> response) {
                String dummy = response.body().getUs().getStats().getCompetitive().getGameStats().getAllDamageDone().toString();
                    Log.d("JSON:::: ", dummy);
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
