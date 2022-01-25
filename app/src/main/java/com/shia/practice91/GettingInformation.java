package com.shia.practice91;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GettingInformation extends AppCompatActivity {

    TextView nameEdit, familyEdit, ageEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_information);

        Bundle bundle2 = getIntent().getExtras();

        if (bundle2 == null) {
            return;
        }

        String name = bundle2.getString("firstName");
        String family = bundle2.getString("lastName");
        int old = bundle2.getInt("age");

        nameEdit = findViewById(R.id.nameEdit);
        familyEdit = findViewById(R.id.familyEdit);
        ageEdit = findViewById(R.id.ageEdit);

        nameEdit.setText("Name : " + name);
        familyEdit.setText("Family : " + family);
        ageEdit.setText("Age : " + old);
    }

    public void backButton(View view) {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
}