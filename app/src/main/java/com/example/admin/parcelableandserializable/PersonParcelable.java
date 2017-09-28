package com.example.admin.parcelableandserializable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Admin on 9/28/2017.
 */

public class PersonParcelable implements Parcelable {
    String Name;
    String Age;
    String Gender;
    String Address;

    public PersonParcelable(String name, String age, String gender, String address) {
        Name = name;
        Age = age;
        Gender = gender;
        Address = address;
    }

    protected PersonParcelable(Parcel in) {
        Name = in.readString();
        Age = in.readString();
        Gender = in.readString();
        Address = in.readString();
    }

    public static final Creator<PersonParcelable> CREATOR = new Creator<PersonParcelable>() {
        @Override
        public PersonParcelable createFromParcel(Parcel in) {
            return new PersonParcelable(in);
        }

        @Override
        public PersonParcelable[] newArray(int size) {
            return new PersonParcelable[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(Age);
        dest.writeString(Gender);
        dest.writeString(Address);
    }
}
