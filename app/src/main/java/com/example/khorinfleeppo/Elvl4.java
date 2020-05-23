package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Elvl4 extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elvl4);
        Button belvl42 = (Button) findViewById(R.id.belvl42);
        belvl42.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.belvl42:
                Intent intent = new Intent(this, Elvl42.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
