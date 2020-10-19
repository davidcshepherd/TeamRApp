package com.example.pillreminderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
            .setSmallIcon(R.drawable.rx_icon)
            .setContentTitle("Daily Reminder")
            .setContentText("Take your pills!")
            .setStyle( new NotificationCompat.BigTextStyle())
            .setPriority(NotificationCompat.PRIORITY_DEFAULT);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        public void goToSettingsActivity (View view){

            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);

        }

        public void goToCalendarActivity (View view){

            Intent intent = new Intent(this, CalendarActivity.class);
            startActivity(intent);

        }

        public void goToMedInfoActivity (View view){

            Intent intent = new Intent(this, MedInfoActivity.class);
            startActivity(intent);

        }

        public void goToMedsActivity (View view){

            Intent intent = new Intent(this, MedsActivity.class);
            startActivity(intent);

        }

}
