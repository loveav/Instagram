package com.example.love.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FinalAssignment extends AppCompatActivity {

    public void mainClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void mainClick1(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void mainClick2(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    public void mainClick3(View view) {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

    public void mainClick4(View view) {
        Intent intent = new Intent(this, Main7Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_assignment);
    }
}
