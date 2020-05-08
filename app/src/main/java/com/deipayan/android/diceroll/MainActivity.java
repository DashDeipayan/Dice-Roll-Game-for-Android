package com.deipayan.android.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.rollButton);
        final ImageView leftDice = (ImageView) findViewById(R.id.ButtonLeft);
        final ImageView rightDice = (ImageView) findViewById(R.id.ButtonRight);
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(MainActivity.this,"Rolled!!",Toast.LENGTH_SHORT);
                toast.show();
                Random random = new Random();
                int number = random.nextInt(6);
                leftDice.setImageResource(diceArray[number]);
                int number2 = random.nextInt(6);
                rightDice.setImageResource(diceArray[number2]);

            }
        });

    }


}
