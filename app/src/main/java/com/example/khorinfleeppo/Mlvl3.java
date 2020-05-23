package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mlvl3 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlvl3);
        Button bmlvl32 = (Button) findViewById(R.id.bmlvl32);
        bmlvl32.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bmlvl32:
                Intent intent = new Intent(this, Mlvl32.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
