package com.example.androidleadersboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.Toolbar;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class SubmitProject extends AppCompatActivity {

    SubmitProjectDetails submitProjectResponsesData;
    EditText email, githubLink, fname, lname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_project);

        ImageButton backButton = (ImageButton) findViewById(R.id.btnBack);
        Button postButton = (Button) findViewById(R.id.btnPostData);
        fname = (EditText) findViewById(R.id.etFirstName);
        lname = (EditText) findViewById(R.id.etFirstName);
        email = (EditText) findViewById(R.id.etEmail);
        githubLink = (EditText) findViewById(R.id.etGithubLink);

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

    private void postData() {

        Api.getClient().registration(email.getText().toString().trim(),
                fname.getText().toString().trim(),
                lname.getText().toString().trim(),
                githubLink.getText().toString().trim(), new Callback<SubmitProjectDetails>() {
                    @Override
                    public void success(SubmitProjectDetails submitProjectDetails, Response response) {
                        // in this method we will get the response from API

                        submitProjectResponsesData = submitProjectDetails;
                        // display the message getting from web api
                        Toast.makeText(SubmitProject.this, submitProjectDetails.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        // if error occurs in network transaction then we can get the error in this method.
                        Toast.makeText(SubmitProject.this, error.toString(), Toast.LENGTH_LONG).show();
                        Log.d("RESULT", "onResponse: --------------------------------Failure" + error);

                    }
                });
    }
}