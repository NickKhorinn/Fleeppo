package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Elvl13 extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elvl13);
        Button belvl12 = (Button) findViewById(R.id.belvl12);
        belvl12.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.belvl12:
                Intent intent = new Intent(this, Easy.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
