package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hlvl1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlvl1);
        Button bhlvl12 = (Button) findViewById(R.id.bhlvl12);
        bhlvl12.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bhlvl12:
                Intent intent = new Intent(this, Hlvl12.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
