package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mlvl2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlvl2);
        Button bmlvl22 = (Button) findViewById(R.id.bmlvl22);
        bmlvl22.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bmlvl22:
                Intent intent = new Intent(this, Mlvl22.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
