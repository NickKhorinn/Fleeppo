package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mlvl42 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlvl42);
        Button bmlvl43= (Button) findViewById(R.id.bmlvl43);
        bmlvl43.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bmlvl43:
                Intent intent = new Intent(this, Mlvl43.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
