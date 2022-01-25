package com.shia.practice91;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    EditText firstNameEdit, lastNameEdit, ageEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void dataTransfer(View view) {
        Intent intent1 = new Intent(this, GettingRegistration.class);
        intent1.putExtra("firstName", "Mostafa");
        intent1.putExtra("lastName", "Developer");
        intent1.putExtra("age", 29);
        startActivity(intent1);
    }

    public void transferOfInfo(View view) {

        Intent intent2 = new Intent(this, GettingRegistration.class);

        firstNameEdit = findViewById(R.id.firstNameEdit);
        lastNameEdit = findViewById(R.id.lastNameEdit);
        ageEdit = findViewById(R.id.ageEdit);

        String firstName = firstNameEdit.getText().toString();
        String lastName = lastNameEdit.getText().toString();
        String age = ageEdit.getText().toString();

        intent2.putExtra("Name", firstName);
        intent2.putExtra("Family", lastName);
        intent2.putExtra("Old", age);

        startActivity(intent2);
    }
}