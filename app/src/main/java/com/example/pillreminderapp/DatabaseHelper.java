package com.example.pillreminderapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/*
*Class helps with using SQLite open helper and creating a database
* Made by: Deven Sharma
 */
public class DatabaseHelper extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME = "Medications.db";
    public static final String TABLE_NAME = "Medications_Table";
    public static final String COL_1 = "Name";
    public static final String COL_2 = "Time_taken";
    public static final String COL_ID = "ID";

    public DatabaseHelper(@Nullable Context context )
    {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
}

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String createDataStatement = "CREATE TABLE " + TABLE_NAME + " " + "(ID integer PRIMARY KEY AUTOINCREMENT, " + COL_1 + " TEXT, " + COL_2 +" TEXT )" ;
        db.execSQL(createDataStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }

    public boolean addOne(UserModel model)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_1, model.getName());
        cv.put(COL_2, model.getTimeTaken());
        final long insert = db.insert(TABLE_NAME, null, cv);
        if(insert == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
