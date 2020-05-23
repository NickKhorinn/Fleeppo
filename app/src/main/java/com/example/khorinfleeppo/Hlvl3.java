package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hlvl3 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlvl3);
        Button bhlvl32 = (Button) findViewById(R.id.bhlvl32);
        bhlvl32.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bhlvl32:
                Intent intent = new Intent(this, Hlvl32.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
