package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsAcivity extends AppCompatActivity {


    private String[][] doctor_details1 =
            {
                    {"Doctor Name : Dr. Emily Johnson "   , "555-123-4567"},
                    {"Doctor Name :Dr. Michael Smith "   , "555-987-6543"},
                    {"Doctor Name :Dr. Sarah Lee     "   , "555-345-6789"},
                    {"Doctor Name :Dr. David Chen   "    , "555-876-5432"},
                    {"Doctor Name :Dr. Jennifer Brown"   , "555-234-5678"},
            };
    private String[][] doctor_details2=
            {
                    {"Doctor Name :Dr. Christopher Wong" , "555-654-3210"},
                    {"Doctor Name :Dr. Jessica Martinez" , "555-890-1234"},
                    {"Doctor Name :Dr. Daniel Kim "      , "555-432-1098"},
                    {"Doctor Name :Dr. Rachel Nguyen  "  , "555-210-9876"},
                    {"Doctor Name :Dr. Kevin Patel "     , "555-678-9012"},
            };
    TextView tv;

    String[][] doctor_details = {};
    Button btnback;
    ArrayList List;
    SimpleAdapter sa;
    HashMap<String,String> item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details_acivity);
        tv=findViewById(R.id.textviewDDtitle);
        btnback=findViewById(R.id.BtnDDback);

        Intent intent=getIntent();
        String title = intent.getStringExtra("title");
        tv.setText(title);

        if(title.equals("Family Physician"))
        {
            doctor_details=doctor_details1;
        }
        else if(title.equals("Cancer Doctor"))
        {
            doctor_details=doctor_details2;
        }


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorDetailsAcivity.this,Finddoctor.class));
            }
        });

        List = new ArrayList();
        for(int i=0;i<doctor_details.length;i++)
        {
            item = new HashMap<String,String>();
            item.put("Line1",doctor_details[i][0]);
            item.put("Line2",doctor_details[i][1]);

            List.add(item);

        }

    }
}