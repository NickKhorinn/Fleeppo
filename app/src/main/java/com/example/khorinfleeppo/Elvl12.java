package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Elvl12 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elvl12);

        Button belvl13 = (Button) findViewById(R.id.belvl13);
        belvl13.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.belvl13:
                Intent intent = new Intent(this, Elvl13.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
