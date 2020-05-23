package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Midle extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midle);
        Button bmlvl1= (Button) findViewById(R.id.bmlvl1);
        bmlvl1.setOnClickListener(this);
        Button bmlvl2= (Button) findViewById(R.id.bmlvl2);
        bmlvl2.setOnClickListener(this);
        Button bmlvl3= (Button) findViewById(R.id.bmlvl3);
        bmlvl3.setOnClickListener(this);
        Button bmlvl4= (Button) findViewById(R.id.bmlvl4);
        bmlvl4.setOnClickListener(this);
        Button bmex= (Button) findViewById(R.id.bmex);
        bmex.setOnClickListener(this);

    }
    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.bmlvl1:
                Intent intent = new Intent(this, Mlvl1.class);
                startActivity(intent);
                break;
            default:
                break;}
        switch (v.getId()) {
            case R.id.bmlvl2:
                Intent intent1 = new Intent(this, Mlvl2.class);
                startActivity(intent1);
                break;
            default:
                break;}
        switch (v.getId()) {
            case R.id.bmlvl3:
                Intent intent2 = new Intent(this, Mlvl3.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
        switch (v.getId()) {
            case R.id.bmlvl4:
                Intent intent3 = new Intent(this, Mlvl4.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
        switch (v.getId()) {
            case R.id.bmex:
                Intent intent4 = new Intent(this, level.class);
                startActivity(intent4);
                break;
            default:
                break;
    }
}}
