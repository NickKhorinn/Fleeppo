package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mlvl4 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlvl4);
        Button bmlvl42 = (Button) findViewById(R.id.bmlvl42);
        bmlvl42.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bmlvl42:
                Intent intent = new Intent(this, Mlvl42.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
