package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager viewpage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab=findViewById(R.id.tab);
        viewpage=findViewById(R.id.viewpage);

        Viewpageradaptar adaptar=new Viewpageradaptar(getSupportFragmentManager());
        viewpage.setAdapter(adaptar);

        tab.setupWithViewPager(viewpage);
    }
}