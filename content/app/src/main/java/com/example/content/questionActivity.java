package com.example.content;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class questionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
    }

}
