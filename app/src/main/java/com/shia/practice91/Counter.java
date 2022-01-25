package com.shia.practice91;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Counter extends AppCompatActivity {

    int counter;
    TextView resultText, aboutText;
    Button buttonPlus, buttonMinus, buttonZero, buttonAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        counter = 0;
        resultText = findViewById(R.id.resultText);
        aboutText = findViewById(R.id.aboutText);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonZero = findViewById(R.id.buttonZero);
        buttonAbout = findViewById(R.id.buttonAbout);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter ++;
                resultText.setText(Integer.toString(counter));
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter --;
                resultText.setText(Integer.toString(counter));
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                resultText.setText(Integer.toString(counter));
            }
        });

        buttonAbout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                aboutText.setText(getResources().getString(R.string.website));
                return true;
            }
        });
    }
}