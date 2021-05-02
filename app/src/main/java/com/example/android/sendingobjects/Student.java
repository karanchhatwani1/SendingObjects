package com.example.android.sendingobjects;

import java.io.Serializable;

public class Student implements Serializable {

    String name;
    String rollNumber;
    String phoneNumber;

    public Student() {
    }

    public Student(String name, String rollNumber, String phoneNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
    }
}
