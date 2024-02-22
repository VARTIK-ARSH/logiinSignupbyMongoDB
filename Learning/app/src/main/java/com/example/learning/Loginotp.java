package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Loginotp extends AppCompatActivity {

    String phoneNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginotp);

        phoneNumber=getIntent().getExtras().getString("phone");
        Toast.makeText(getApplicationContext(),phoneNumber,Toast.LENGTH_LONG).show();
    }



}