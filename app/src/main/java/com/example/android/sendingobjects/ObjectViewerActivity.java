package com.example.android.sendingobjects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android.sendingobjects.databinding.ActivityMainBinding;
import com.example.android.sendingobjects.databinding.ActivityObjectViewerBinding;

public class ObjectViewerActivity extends AppCompatActivity {

    ActivityObjectViewerBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityObjectViewerBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        gettingAttributes();
        setTitle("Student Details");
    }

    private void gettingAttributes() {

        Student student = (Student) getIntent().getSerializableExtra(Constants.MY_CLASS);
        b.receivedName.setText(""+student.name);
        b.recievedRoll.setText(""+student.rollNumber);
        b.receivedPhone.setText(""+student.phoneNumber);

    }
}