package com.example.love.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main7Activity extends AppCompatActivity {

    public void mainClick(View view) {
        Intent intent = new Intent(this, FinalAssignment.class);
        startActivity(intent);
    }

    public void mainClick1(View view) {
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
}
