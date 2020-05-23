package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mlvl12 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlvl12);
        Button bmlvl13 = (Button) findViewById(R.id.bmlvl13);
        bmlvl13.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bmlvl13:
                Intent intent = new Intent(this, Mlvl13.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
