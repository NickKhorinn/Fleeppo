package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mlvl43 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlvl43);
        Button bmlvl4ex = (Button) findViewById(R.id.bmlvl4ex);
        bmlvl4ex.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bmlvl4ex:
                Intent intent = new Intent(this, Midle.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
