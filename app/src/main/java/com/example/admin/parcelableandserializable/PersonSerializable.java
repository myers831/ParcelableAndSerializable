package com.example.admin.parcelableandserializable;

import java.io.Serializable;

/**
 * Created by Admin on 9/28/2017.
 */

public class PersonSerializable implements Serializable {
    String Name;
    String Age;
    String Gender;
    String Address;

    public PersonSerializable(String name, String age, String gender, String address) {
        Name = name;
        Age = age;
        Gender = gender;
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public String getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
