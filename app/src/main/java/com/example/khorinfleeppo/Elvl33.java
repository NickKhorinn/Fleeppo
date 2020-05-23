package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Elvl33 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elvl33);
        Button belvl3ex = (Button) findViewById(R.id.belvl3ex);
        belvl3ex.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.belvl3ex:
                Intent intent = new Intent(this, Easy.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
