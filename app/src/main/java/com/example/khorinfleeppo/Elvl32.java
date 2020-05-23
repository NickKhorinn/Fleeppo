package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Elvl32 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elvl32);
        Button belvl2ex = (Button) findViewById(R.id.belvl2ex);
        belvl2ex.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.belvl33:
                Intent intent = new Intent(this, Elvl33.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
