package com.example.khorinfleeppo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bstart= (Button) findViewById(R.id.bstart);
        bstart.setOnClickListener(this);



        }
        @Override
        public void onClick (View view){
        switch (view.getId()){
            case R.id.bstart:
                Intent intent = new Intent(this, Privet.class) ;
                startActivity(intent);
                break;
            default:
                break;
        }
        }
}


