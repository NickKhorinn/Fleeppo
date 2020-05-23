package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hard extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);
        Button bhlvl1= (Button) findViewById(R.id.bhlvl1);
        bhlvl1.setOnClickListener(this);
        Button bhlvl2= (Button) findViewById(R.id.bhlvl2);
        bhlvl2.setOnClickListener(this);
        Button bhlvl3= (Button) findViewById(R.id.bhlvl3);
        bhlvl3.setOnClickListener(this);
        Button bhlvl4= (Button) findViewById(R.id.bhlvl4);
        bhlvl4.setOnClickListener(this);
        Button bhex= (Button) findViewById(R.id.bhex);
        bhex.setOnClickListener(this);
    }
    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.bhlvl1:
                Intent intent = new Intent(this, Hlvl1.class);
                startActivity(intent);
                break;
            default:
                break;}
        switch (v.getId()) {
            case R.id.bhlvl2:
                Intent intent1 = new Intent(this, Hlvl2.class);
                startActivity(intent1);
                break;
            default:
                break;}
        switch (v.getId()) {
            case R.id.bhlvl3:
                Intent intent2 = new Intent(this, Hlvl3.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
        switch (v.getId()) {
            case R.id.bhlvl4:
                Intent intent3 = new Intent(this, Hlvl4.class);
                startActivity(intent3);
                break;
            default:
                break;
        }
        switch (v.getId()) {
            case R.id.bhex:
                Intent intent4 = new Intent(this, level.class);
                startActivity(intent4);
                break;
            default:
                break;
        }
    }
}
