package com.example.chitchat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class username extends AppCompatActivity {


    EditText name;
    Button letmein;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
        name=findViewById(R.id.name);
        letmein=findViewById(R.id.letmein);



    }
}