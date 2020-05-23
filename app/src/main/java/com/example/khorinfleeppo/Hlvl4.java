package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hlvl4 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlvl4);
        Button bhlvl42 = (Button) findViewById(R.id.bhlvl42);
        bhlvl42.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bhlvl42:
                Intent intent = new Intent(this, Hlvl42.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
