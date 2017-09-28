package com.example.admin.parcelableandserializable;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<PersonSerializable> personList = new ArrayList<>();

    private EditText etPersonName;
    private EditText etPersonAge;
    private EditText etPersonGender;
    private EditText etPersonAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPersonName = (EditText) findViewById(R.id.etPersonName);
        etPersonAge = (EditText) findViewById(R.id.etPersonAge);
        etPersonGender = (EditText) findViewById(R.id.etPersonGender);
        etPersonAddress = (EditText) findViewById(R.id.etPersonAddress);
    }

    public void sendPerson(View view) {
        String personName = etPersonName.getText().toString();
        String personAge = etPersonAge.getText().toString();
        String personGender = etPersonGender.getText().toString();
        String personAddress = etPersonAddress.getText().toString();

        PersonSerializable personSerializable = new PersonSerializable(personName, personAge, personGender, personAddress);
        PersonParcelable personParcelable = new PersonParcelable(personName, personAge, personGender, personAddress);

        switch(view.getId()){
            case R.id.btnSendSerializable:
                Intent intentS = new Intent(this, PersonActivity.class);
                intentS.putExtra("personS", personSerializable);
                startActivity(intentS);
                break;
            case R.id.btnSendParcelable:
                Intent intentP = new Intent(this, PersonActivity.class);
                intentP.putExtra("personP", personParcelable);
                startActivity(intentP);
                break;
            case R.id.btnSharePerson:
                Intent intentSP = new Intent();
                intentSP.setAction(Intent.ACTION_SEND);
                intentSP.putExtra(Intent.EXTRA_TEXT, "This person's name is " + personName);
                intentSP.setType("text/plain");
                startActivity(intentSP);
                break;
            case R.id.btnAddToList:
                personList.add(new PersonSerializable(personName, personAge, personGender, personAddress));
                break;
            case R.id.btnSendList:
                Intent intentSL = new Intent(this, PersonList.class);
                intentSL.putExtra("personSL", personList);
                startActivity(intentSL);
                break;
        }
    }
}
 