package com.example.love.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main6Activity extends AppCompatActivity {

    public void mainClick(View view) {
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }


    public void mainClick1(View view) {
        Intent intent = new Intent(this, FinalAssignment.class);
        startActivity(intent);
    }

    public void mainClick2(View view) {
        Intent intent = new Intent(this, Main8Activity.class);
        startActivity(intent);
    }



    public void mainClick3(View view) {
        Intent intent = new Intent(this, Main9Activity.class);
        startActivity(intent);
    }

    public void mainClick4(View view) {
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }

    public void mainClick5(View view) {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
}
