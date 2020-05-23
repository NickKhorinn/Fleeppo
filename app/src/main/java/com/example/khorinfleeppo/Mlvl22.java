package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mlvl22 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlvl22);
        Button bmlvl23 = (Button) findViewById(R.id.bmlvl23);
        bmlvl23.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bmlvl23:
                Intent intent = new Intent(this, Mlvl23.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
