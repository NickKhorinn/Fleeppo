package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Elvl2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elvl2);
        Button belvl22 = (Button) findViewById(R.id.belvl22);
        belvl22.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.belvl22:
                Intent intent = new Intent(this, Elvl22.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}