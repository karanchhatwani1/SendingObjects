package com.example.android.sendingobjects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.android.sendingobjects.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());
    }

    public void sendData(View view) {
        String inputName = bind.name.getEditText().getText().toString().trim();
        String inputRoll = bind.rollNo.getEditText().getText().toString().trim();
        String inputPhone = bind.phoneNo.getEditText().getText().toString().trim();

        if(inputName.isEmpty()){

            bind.name.setError("Enter valid name");
            return;

        }
        bind.name.setError(null);

        if(inputRoll.isEmpty() || !inputRoll.matches("(?!00)\\d{2}(([a-z]{4})|([A-Z]{4}))\\d{3,4}")){

            bind.rollNo.setError("Enter valid roll number");
            return;

        }
        bind.rollNo.setError(null);

        if(inputPhone.isEmpty() || !inputPhone.matches("^\\d{10}$")){

            bind.phoneNo.setError("Enter valid phone number");
            return;

        }
        bind.phoneNo.setError(null);

        Student student = new Student(inputName,inputRoll,inputPhone);

        Intent intent = new Intent(this,ObjectViewerActivity.class);
        intent.putExtra(Constants.MY_CLASS,student);
        startActivity(intent);
    }
}