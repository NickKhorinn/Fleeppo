package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hlvl42 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlvl42);
        Button bhlvl43 = (Button) findViewById(R.id.bhlvl43);
        bhlvl43.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bhlvl43:
                Intent intent = new Intent(this, Hlvl43.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }


}
