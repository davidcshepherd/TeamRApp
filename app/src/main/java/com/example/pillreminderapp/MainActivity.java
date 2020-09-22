package com.example.pillreminderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    /* layout class */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /* settings button class */
    public void goToSettingsActivity (View view){
        Intent intent = new Intent (this, activity_settings.class);
        startActivity(intent);
    }


    /* notifications code block */

    /*

    Button aNotification;

    aNotification = findViewById(R.id.bt_notification);
    aNotification.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String message = "Take your meds";
            NotificationCompat.Builder builder = new NotificationCompat.Builder(
                    MainActivity.this
            )
                    .setContentTitle("New Notification")
                    .setContentText(message)
                    .setAutoCancel(true);
            Intent intent = new Intent(MainActivity.this,NotificationActivity.class);
        }
    });

    */

}
