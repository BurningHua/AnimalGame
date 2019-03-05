package com.example.animals;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Round3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round3);
    }

    public void onChosenBtn1(View view){
        Intent intent = new Intent();
        intent.setClass(Round3Activity.this, WinActivity.class);
        startActivity(intent);
        finish();
    }

    public void onChosenBtn2(View view){
        Intent intent = new Intent();
        intent.setClass(Round3Activity.this, LoseActivity.class);
        startActivity(intent);
        finish();
    }

    public void onChosenBtn3(View view){
        Intent intent = new Intent();
        intent.setClass(Round3Activity.this, LoseActivity.class);
        startActivity(intent);
        finish();
    }

    public void onChosenBtn4(View view){
        Intent intent = new Intent();
        intent.setClass(Round3Activity.this, LoseActivity.class);
        startActivity(intent);
        finish();
    }
}
