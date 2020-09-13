package com.example.androidleadersboard;

import android.util.Log;

import retrofit.RestAdapter;

public class Api {

    public static ApiInterface getClient() {

        // change your base URL
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint("https://docs.google.com/forms/d/e")
                .build();

        //Creating object for our interface
        ApiInterface api = adapter.create(ApiInterface.class);
        Log.d("API", "onResponse: --------------------------------Failure" + api);
        return api; // return the APIInterface object
    }
}
