package com.example.pillreminderapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/*
*Class helps with using SQLite open helper and creating a database
* Made by: Deven Sharma uowo
 */
public class DatabaseHelper extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME = "Medications.db";
    public static final String TABLE_NAME = "Medications_Table";
    public static final String COL_1 = "Name";
    public static final String COL_2 = "Time_taken";
    public static final String COL_3 = "Days_to_refill";
    public static final String COL_4 = "Med_type";


    public DatabaseHelper(@Nullable Context context )
    {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

    }
}
