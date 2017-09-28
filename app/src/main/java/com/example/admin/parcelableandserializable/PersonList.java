package com.example.admin.parcelableandserializable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class PersonList extends AppCompatActivity {

    List<PersonSerializable> personList = new ArrayList<>();
    String TAG = "PersonList";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_list);

        personList = (List<PersonSerializable>) getIntent().getSerializableExtra("personSL");

        for(PersonSerializable p: personList){
            Log.d(TAG,"Name: " + p.getName() + " " + "Age: " + p.getAge() + " " + "Gender: " + p.getGender() + " " + "Address: " + p.getAddress() + " ");
        }

    }
}
