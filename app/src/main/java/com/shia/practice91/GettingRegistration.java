package com.shia.practice91;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GettingRegistration extends AppCompatActivity {

    TextView firsNamePlace, lastNamePlace, agePlace, nameEdit, familyEdit, ageEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getting_registration);

        //constant info

        Bundle bundle1 = getIntent().getExtras();

        String firstName = bundle1.getString("firstName");
        String lastName = bundle1.getString("lastName");
        int age = bundle1.getInt("age");

        firsNamePlace = findViewById(R.id.firstNamePlace);
        lastNamePlace = findViewById(R.id.lastNamePlace);
        agePlace = findViewById(R.id.agePlace);

        firsNamePlace.setText("First Name : " + firstName);
        lastNamePlace.setText("Last Name : " + lastName);
        agePlace.setText("age : " + age);

        //changeable info

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
        Intent intent1 = new Intent(this, Registration.class);
        startActivity(intent1);
    }
}