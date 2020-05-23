package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hlvl12 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlvl12);
        Button bhlvl13 = (Button) findViewById(R.id.bhlvl13);
        bhlvl13.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bhlvl13:
                Intent intent = new Intent(this, Hlvl13.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
