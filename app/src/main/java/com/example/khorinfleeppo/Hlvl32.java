package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hlvl32 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlvl32);
        Button bhlvl33 = (Button) findViewById(R.id.bhlvl33);
        bhlvl33.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bhlvl33:
                Intent intent = new Intent(this, Hlvl33.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }

}
