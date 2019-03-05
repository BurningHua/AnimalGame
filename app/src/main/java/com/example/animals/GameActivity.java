package com.example.animals;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void onChosenBtn1(View view){
        Intent intent = new Intent();
        intent.setClass(GameActivity.this, LoseActivity.class);
        startActivity(intent);
        finish();
    }

    public void onChosenBtn2(View view){
        Intent intent = new Intent();
        intent.setClass(GameActivity.this, Round2Activity.class);
        startActivity(intent);
        finish();
    }

    public void onChosenBtn3(View view){
        Intent intent = new Intent();
        intent.setClass(GameActivity.this, LoseActivity.class);
        startActivity(intent);
        finish();
    }

    public void onChosenBtn4(View view){
        Intent intent = new Intent();
        intent.setClass(GameActivity.this, LoseActivity.class);
        startActivity(intent);
        finish();
    }
}
