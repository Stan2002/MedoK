package com.stanley.medok;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String[] words = {
            "AERIUS",
            "GRAZAX",
            "TRUC DU FRIGO",
            "SERETIDE",

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button button = (Button)findViewById(R.id.button);
        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);

            }
        });

        Button button2 = (Button)findViewById(R.id.button2);
        assert button2 != null;
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                PendingIntent pIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);

                Notification notification = new Notification.Builder(MainActivity.this)
                        .setContentTitle("AERIUS")
                        .setContentText("Il faut en acheter !!!")
                        .setSmallIcon(R.drawable.ic_stat_name)
                        .setPriority(Notification.PRIORITY_MAX)
                        .setContentIntent(pIntent).getNotification();



                notification.flags = Notification.FLAG_AUTO_CANCEL;
                notification.flags = Notification.FLAG_NO_CLEAR;

                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notificationManager.notify(1, notification);

            }





        });

        Button button3 = (Button)findViewById(R.id.button3);
        assert button3 != null;
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("MedoK")
                        .setMessage("Créée par Stanley Marjenberg")
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        //rien
                                    }
                                }

                        ).create().show();

            }
        });

        Button button4 = (Button)findViewById(R.id.button4);
        assert button4 != null;
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                PendingIntent pIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);

                Notification notification = new Notification.Builder(MainActivity.this)
                        .setContentTitle("GRAZAX")
                        .setContentText("Il faut en acheter !!!")
                        .setSmallIcon(R.drawable.ic_stat_name)
                        .setPriority(Notification.PRIORITY_MAX)
                        .setContentIntent(pIntent).getNotification();


                notification.flags = Notification.FLAG_AUTO_CANCEL;
                notification.flags = Notification.FLAG_NO_CLEAR;

                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notificationManager.notify(2, notification);


                Button button5 = (Button)findViewById(R.id.button5);
                assert button5 != null;
                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                        PendingIntent pIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);

                        Notification notification = new Notification.Builder(MainActivity.this)
                                .setContentTitle("TRUC DU FRIGO")
                                .setContentText("Il faut en acheter !!!")
                                .setSmallIcon(R.drawable.ic_stat_name)
                                .setPriority(Notification.PRIORITY_MAX)
                                .setContentIntent(pIntent).getNotification();


                        notification.flags = Notification.FLAG_AUTO_CANCEL;
                        notification.flags = Notification.FLAG_NO_CLEAR;

                        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                        notificationManager.notify(3, notification);

                    }
                });

                Button button6 = (Button)findViewById(R.id.button6);
                assert button6 != null;
                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                        PendingIntent pIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);

                        Notification notification = new Notification.Builder(MainActivity.this)
                                .setContentTitle("SERETIDE")
                                .setContentText("Il faut en acheter !!!")
                                .setSmallIcon(R.drawable.ic_stat_name)
                                .setPriority(Notification.PRIORITY_MAX)
                                .setContentIntent(pIntent).getNotification();


                        notification.flags = Notification.FLAG_AUTO_CANCEL;
                        notification.flags = Notification.FLAG_NO_CLEAR;

                        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                        notificationManager.notify(4, notification);

                    }





                });



        }});}}
