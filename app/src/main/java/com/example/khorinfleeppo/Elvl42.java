package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Elvl42 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elvl42);
        Button belvl43 = (Button) findViewById(R.id.belvl43);
        belvl43.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.belvl43:
                Intent intent = new Intent(this, Elvl43.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
