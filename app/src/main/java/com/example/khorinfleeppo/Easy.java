package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Easy extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        Button belvl1= (Button) findViewById(R.id.belvl1);
        belvl1.setOnClickListener(this);
        Button belvl2= (Button) findViewById(R.id.belvl2);
        belvl2.setOnClickListener(this);
        Button belvl3= (Button) findViewById(R.id.belvl3);
        belvl3.setOnClickListener(this);
        Button belvl4= (Button) findViewById(R.id.belvl4);
        belvl4.setOnClickListener(this);
        Button beex= (Button) findViewById(R.id.beex);
        beex.setOnClickListener(this);


    }
    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.belvl1:
                Intent intent = new Intent(this, Elvl1.class);
                startActivity(intent);
                break;
            default:
                break;}
        switch (v.getId()) {
            case R.id.belvl2:
                Intent intent1 = new Intent(this, Elvl2.class);
                startActivity(intent1);
                break;
            default:
                break;}
        switch (v.getId()) {
            case R.id.belvl3:
                Intent intent2 = new Intent(this, Elvl3.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
        switch (v.getId()) {
            case R.id.belvl4:
                Intent intent3 = new Intent(this, Elvl4.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
        switch (v.getId()) {
            case R.id.beex:
                Intent intent4 = new Intent(this, level.class);
                startActivity(intent4);
                break;
            default:
                break;
    }
}}
