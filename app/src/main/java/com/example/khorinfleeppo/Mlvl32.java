package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mlvl32 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlvl32);
        Button bmlvl33 = (Button) findViewById(R.id.bmlvl33);
        bmlvl33.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bmlvl33:
                Intent intent = new Intent(this, Mlvl33.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
