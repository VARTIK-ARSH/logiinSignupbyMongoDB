package com.example.hospital;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Viewpageradaptar extends FragmentPagerAdapter {


    public Viewpageradaptar(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ActivepatientsFragment();
        }
        else
        {
            return new PatientsrequestsFragment();
        }

    }

    @Override
    public int getCount() {

        return 2;//no.of tabs
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "ActivepatientsFragment";
        }
        else
        {
            return "PatientsrequestsFragment";
        }
    }
}
