package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Elvl22 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elvl22);
        Button belvl23 = (Button) findViewById(R.id.belvl23);
        belvl23.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.belvl23:
                Intent intent = new Intent(this, Elvl23.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}