package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class level extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);


    }



    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.beasy:
                Intent intent = new Intent(this, Easy.class);
                startActivity(intent);
                break;
            default:
                break;}
            switch (v.getId()) {
                case R.id.bmidle:
                    Intent intent1 = new Intent(this, Midle.class);
                    startActivity(intent1);
                    break;
                default:
                    break;}
        switch (v.getId()) {
                case R.id.bhard:
                    Intent intent2 = new Intent(this, Hard.class);
                    startActivity(intent2);
                    break;
                default:
                    break;
            }
        }
    }