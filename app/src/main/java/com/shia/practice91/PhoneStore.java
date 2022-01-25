package com.shia.practice91;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PhoneStore extends AppCompatActivity {

    RecyclerView recyclerView;
    List<PhoneItem> phoneItems = new ArrayList<>();
    PhoneItemAdapter phoneItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop_store);

        recyclerView = findViewById(R.id.recyclerView);

        phoneItemAdapter = new PhoneItemAdapter(phoneItems, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(phoneItemAdapter);

        setData();
    }

    private void setData() {
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));
        phoneItems.add(new PhoneItem(R.drawable.phone1, "Samsung", "Galaxy", "10,000,000" ));

        phoneItemAdapter.notifyDataSetChanged();

    }
}