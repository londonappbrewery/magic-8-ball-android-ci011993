package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView eight_ball;
        eight_ball = findViewById(R.id.imageView_eight_ball);

        final int[] ArrayBall = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
        };

        Button buttonask;
        buttonask = findViewById(R.id.button_ask);

        buttonask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random RandomNumberGenerator = new Random();
                int Number = RandomNumberGenerator.nextInt(4);
                eight_ball.setImageResource(ArrayBall[Number]);
            }
        });
        }}
