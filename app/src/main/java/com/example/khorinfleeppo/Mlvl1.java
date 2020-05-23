package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mlvl1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlvl1);
        Button bmlvl12 = (Button) findViewById(R.id.bmlvl12);
        bmlvl12.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bmlvl12:
                Intent intent = new Intent(this, Mlvl12.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
