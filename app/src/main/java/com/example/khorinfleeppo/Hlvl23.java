package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hlvl23 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlvl23);
        Button bhlvl2ex= (Button) findViewById(R.id.bhlvl2ex);
        bhlvl2ex.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bhlvl2ex:
                Intent intent = new Intent(this, Hard.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
