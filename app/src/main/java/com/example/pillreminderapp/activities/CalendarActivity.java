package com.example.pillreminderapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pillreminderapp.R;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

    }

    public void goToMainActivity (View view){

        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);

    }

}