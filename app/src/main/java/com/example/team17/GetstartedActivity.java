package com.example.team17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GetstartedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarted);

        getSupportActionBar().hide();
    }

    public void mainScreen(View view) {
        startActivity(new Intent(GetstartedActivity.this, MainActivity.class));
    }
}