package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hlvl22 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlvl22);
        Button bhlvl23 = (Button) findViewById(R.id.bhlvl23);
        bhlvl23.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bhlvl23:
                Intent intent = new Intent(this, Hlvl23.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
