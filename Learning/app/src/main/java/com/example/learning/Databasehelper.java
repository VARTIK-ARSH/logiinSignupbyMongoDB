package com.example.learning;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Databasehelper extends SQLiteOpenHelper {

    private static final String DATBASE_NAME="Contacts";
    private static final int DATABASE_VERSION=1;
    private static final String TABLE_CONTACT="Contacts";
    private static final String  PH_NO="Phonenumber";
    private static final String OTP="Otp_no";


    public Databasehelper(@Nullable Context context) {
        super(context, DATBASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE "+ TABLE_CONTACT + "(" + PH_NO + " INTEGER PRIMARY KEY," + OTP + "INTEGER" + ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACT);

        onCreate(db);
    }

    public void addcontact(String Phonenumber,String OTP_no){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values= new ContentValues();
        values.put(PH_NO,Phonenumber);
        values.put(OTP,OTP_no);


        db.insert(TABLE_CONTACT, null , values );

    }






}
