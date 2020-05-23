package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Privet extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privet);
        Button bstart2= (Button) findViewById(R.id.bstart2);
        bstart2.setOnClickListener(this);
    }
    @Override
    public void onClick (View view) {
        switch (view.getId()) {
            case R.id.bstart2:
                Intent intent = new Intent(this, level.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }}