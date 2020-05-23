package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mlvl23 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlvl23);
        Button bmlvl2ex = (Button) findViewById(R.id.bmlvl2ex);
        bmlvl2ex.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bmlvl2ex:
                Intent intent = new Intent(this, Midle.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
