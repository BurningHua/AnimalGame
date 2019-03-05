package com.example.animals;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnExit(View view) {
        android.os.Process.killProcess(android.os.Process.myPid());   //获取PID
        System.exit(0);

    }

    public void OnPlay(View view) {

        Intent intent = new Intent();
        intent.setClass(MainActivity.this, GameActivity.class);
        startActivity(intent);

    }
}
