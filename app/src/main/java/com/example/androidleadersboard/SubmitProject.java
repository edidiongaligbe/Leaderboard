package com.example.androidleadersboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class SubmitProject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_project);

        ImageButton backButton = (ImageButton) findViewById(R.id.btnBack);
        Button postButton = (Button) findViewById(R.id.btnPostData);

        backButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(), Leaderboard.class));
            }
        });

        postButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                postData();
            }
        });

    }

    public void postData(){


    }
}