package com.shia.practice91;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Car extends AppCompatActivity {

    Button carOne, carTwo, carThree, carFour, carFive, carSix, carSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        carOne = findViewById(R.id.carOne);
        carTwo = findViewById(R.id.carTwo);
        carThree = findViewById(R.id.carThree);
        carFour = findViewById(R.id.carFour);
        carFive = findViewById(R.id.carFive);
        carSix = findViewById(R.id.carSix);
        carSeven = findViewById(R.id.carSeven);

        carOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentOne fragmentOne = new FragmentOne();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragmentOne);
                fragmentTransaction.commit();
            }
        });

        carTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTwo fragmentTwo = new FragmentTwo();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragmentTwo);
                fragmentTransaction.commit();
            }
        });

        carThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentThree fragmentThree = new FragmentThree();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragmentThree);
                fragmentTransaction.commit();
            }
        });

        carFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentFour fragmentFour = new FragmentFour();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragmentFour);
                fragmentTransaction.commit();
            }
        });

        carFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentFive fragmentFive = new FragmentFive();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragmentFive);
                fragmentTransaction.commit();
            }
        });

        carSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentSix fragmentSix = new FragmentSix();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragmentSix);
                fragmentTransaction.commit();
            }
        });

        carSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentSeven fragmentSeven = new FragmentSeven();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragmentSeven);
                fragmentTransaction.commit();
            }
        });
    }
}