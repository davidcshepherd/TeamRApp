package com.example.pillreminderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button aNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("message",message);
                PendingIntent pendingIntent= PendingIntent.getActivity(MainActivity.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);
                NotificationManager notificationManager =(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(0,builder.build());

            }
        });

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
