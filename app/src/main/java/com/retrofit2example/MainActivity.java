package com.retrofit2example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.retrofit2example.retrofit.CommanMethod;
import com.retrofit2example.retrofit.RestClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RestClient restClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restClient = new RestClient(); //declare rest client

        // call api use rest client use GET method
        restClient.getService().getGETMethod(0).enqueue(new Callback<CommanMethod>() {
            @Override
            public void onResponse(Call<CommanMethod> call, Response<CommanMethod> response) {
                // get response using
                String abc = response.body().getAbc();
            }

            @Override
            public void onFailure(Call<CommanMethod> call, Throwable t) {

            }
        });

        // call api use rest client use POST method
        restClient.getService().getPOSTMethod(0).enqueue(new Callback<CommanMethod>() {
            @Override
            public void onResponse(Call<CommanMethod> call, Response<CommanMethod> response) {
                String xyz = response.body().getXyz();
            }

            @Override
            public void onFailure(Call<CommanMethod> call, Throwable t) {

            }
        });
    }
}
