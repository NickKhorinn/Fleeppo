package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hlvl2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlvl2);
        Button bhlvl22 = (Button) findViewById(R.id.bhlvl22);
        bhlvl22.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bhlvl22:
                Intent intent = new Intent(this, Hlvl22.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
