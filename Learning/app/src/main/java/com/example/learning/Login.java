package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.hbb20.CountryCodePicker;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity {




    CountryCodePicker codePicker;
    EditText phonelogin;
    Button sendotp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        codePicker=findViewById(R.id.codepicker);
        phonelogin=findViewById(R.id.phonelogin);
        sendotp=findViewById(R.id.sendotp);

        codePicker.registerCarrierNumberEditText(phonelogin);
        sendotp.setOnClickListener((v)->{
            if(!codePicker.isValidFullNumber()) {
                phonelogin.setError("Phone number not valid");
                return;
            }
            Intent intent =new Intent(Login.this, Loginotp.class);
            intent.putExtra("phone",codePicker.getFullNumberWithPlus());
            startActivity(intent);
        });

        Databasehelper dbHelper = new Databasehelper(this);
        dbHelper.addcontact("7668743224","200304");
        dbHelper.addcontact("1111111111","200305");
        dbHelper.addcontact("7668743255","205604");
        dbHelper.addcontact("7668743545","206704");






    }
}