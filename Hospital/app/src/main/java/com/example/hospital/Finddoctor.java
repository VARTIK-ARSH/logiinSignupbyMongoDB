package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Finddoctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finddoctor);

        CardView Backbtn=findViewById(R.id.Backbtn);
        Backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Finddoctor.this,Homepage.class));
            }
        });

        CardView familyphysician = findViewById(R.id.Familyphyciancard);
        familyphysician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Finddoctor.this,DoctorDetailsAcivity.class);
                intent.putExtra("title","Family Physician");
                startActivity(intent);
            }
        });
        CardView dietician=findViewById(R.id.Dentist);
        dietician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Finddoctor.this,DoctorDetailsAcivity.class);
                intent.putExtra("title","DIetician");
                startActivity(intent);
            }
        });
        CardView cancerdoctor=findViewById(R.id.CancerDoctorcard);
        cancerdoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Finddoctor.this,DoctorDetailsAcivity.class);
                intent.putExtra("title","Cancer Doctor");
                startActivity(intent);
            }
        });
    }
}