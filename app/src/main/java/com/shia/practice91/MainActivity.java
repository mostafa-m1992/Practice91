package com.shia.practice91;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item1:
                startActivity(new Intent(MainActivity.this, Counter.class));
                break;
            case R.id.item2:
                startActivity(new Intent(MainActivity.this, Registration.class));
                break;
            case R.id.item3:
                startActivity(new Intent(MainActivity.this, Messages.class));
                break;
            case R.id.item4:
                startActivity(new Intent(MainActivity.this, Car.class));
                break;
            case R.id.item5:
                startActivity(new Intent(MainActivity.this, Information.class));
                break;
            case R.id.item6:
                startActivity(new Intent(MainActivity.this, Store.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}