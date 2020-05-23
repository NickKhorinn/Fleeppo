package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hlvl43 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlvl43);
        Button bhlvl4ex = (Button) findViewById(R.id.bhlvl4ex);
        bhlvl4ex.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bhlvl4ex:
                Intent intent = new Intent(this, Hard.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
