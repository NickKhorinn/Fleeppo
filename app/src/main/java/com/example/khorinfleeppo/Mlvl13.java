package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mlvl13 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlvl13);
        Button bmlvl1ex = (Button) findViewById(R.id.bmlvl1ex);
        bmlvl1ex.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bmlvl1ex:
                Intent intent = new Intent(this, Midle.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
