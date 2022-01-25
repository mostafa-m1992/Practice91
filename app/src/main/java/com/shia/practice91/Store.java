package com.shia.practice91;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Store extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    List<CartItem> cartItems = new ArrayList<>();
    CartItemAdapter cartItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setTitle(R.string.store);
        toolbar.setSubtitle(R.string.subtitle);
        toolbar.setLogo(R.drawable.ic_baseline_add_shopping_cart_24);

        recyclerView = findViewById(R.id.recyclerView);

        cartItemAdapter = new CartItemAdapter(cartItems, this);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

        /*RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);*/

        recyclerView.setAdapter(cartItemAdapter);

        setData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.setting) {
            Toast.makeText(this, "Setting button CLICKED", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.about) {
            Toast.makeText(this, "About button CLICKED", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.profile) {
            Toast.makeText(this, "Profile button CLICKED", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.basket) {
            Toast.makeText(this, "Basket button CLICKED", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.edit) {
            Toast.makeText(this, "Edit button CLICKED", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.buy) {
            Toast.makeText(this, "Buy button CLICKED", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.signOut) {
            Toast.makeText(this, "SignOut button CLICKED", Toast.LENGTH_SHORT).show();
        }
        else if (id == android.R.id.home) {
            onBackPressed();
            //finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private void setData() {
        cartItems.add(new CartItem(R.drawable.asus1, "Laptops"));
        cartItems.add(new CartItem(R.drawable.phone1, "Phones"));
        cartItems.add(new CartItem(R.drawable.backpack1, "BackPacks"));
        cartItems.add(new CartItem(R.drawable.benz1, "Cars"));
        cartItems.add(new CartItem(R.drawable.bike1, "Bikes"));
        cartItems.add(new CartItem(R.drawable.coat1, "Dresses"));
        cartItems.add(new CartItem(R.drawable.flag_ir, "Flags"));
        cartItems.add(new CartItem(R.drawable.flower1, "Flowers"));
        cartItems.add(new CartItem(R.drawable.profile1, "Profiles"));
        cartItems.add(new CartItem(R.drawable.tv1, "TVs"));

        cartItemAdapter.notifyDataSetChanged();
    }
}