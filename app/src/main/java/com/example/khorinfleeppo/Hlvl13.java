package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hlvl13 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlvl13);
        Button bhlvl1ex = (Button) findViewById(R.id.bhlvl1ex);
        bhlvl1ex.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bhlvl1ex:
                Intent intent = new Intent(this, Hard.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
