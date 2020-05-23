package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hlvl33 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlvl33);
        Button bhlvl3ex = (Button) findViewById(R.id.bhlvl3ex);
        bhlvl3ex.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bhlvl3ex:
                Intent intent = new Intent(this, Hard.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
