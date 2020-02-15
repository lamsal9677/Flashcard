package com.example.cpweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //flash que and flash ans

        findViewById(R.id.FlashQue).setVisibility(View.VISIBLE);
        findViewById(R.id.FlashAns).setVisibility(View.INVISIBLE);

        findViewById(R.id.FlashQue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.FlashAns).setVisibility(View.VISIBLE);
                findViewById(R.id.FlashQue).setVisibility(View.INVISIBLE);
            }
        });
    }
}
