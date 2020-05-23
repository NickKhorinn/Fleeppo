package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Elvl43 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elvl43);
        Button belvl4ex = (Button) findViewById(R.id.belvl4ex);
        belvl4ex.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.belvl4ex:
                Intent intent = new Intent(this, Easy.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
