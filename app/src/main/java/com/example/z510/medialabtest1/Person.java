package com.example.z510.medialabtest1;

import android.widget.Toast;

/**
 * Created by Z510 on 07/04/2015.
 */
public class Person {
    private String name;

    @Override
    public String toString() {
        return super.toString();
    }

    private int age;

    public Person() {
        name = "No name";
        age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) { name = n; }

    public void setAge(int a) { age = a; }


    public int calculateDays() {
       return age * 365;
    }

    public void salute() {
//        Toast.makeText(t, "Hiho!!", Toast.LENGTH_LONG).show();
    }
}
