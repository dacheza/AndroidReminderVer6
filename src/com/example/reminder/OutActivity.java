package com.example.reminder;


import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

import static android.graphics.BitmapFactory.decodeResource;


/**
 * Created by Oleksandra on 31.03.2015.
 */
public class OutActivity extends Activity {

    public TextView textView;
    public Button button2;
    public Button button3;
    private static final int NOTIFY_ID = 101;
    static int temp = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.out);

        DateClass a = new DateClass();
        a.addUndSearch();
        Date cuurentTime = new Date();

        final TextView textView1 = (TextView) findViewById(R.id.textView);

        DateFormat df;
        df = DateFormat.getDateInstance( /* dateStyle */ DateFormat.FULL
        );
        String sDate = df.format(cuurentTime);

        textView1.setText("Aktuelle Zeit:  " + sDate + "  Müllabfuhr für das Monat :");

        final ListView list_gold = (ListView) findViewById(R.id.listView);
        final ArrayAdapter<String> adapter_gold = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, DateClass.listeGoldString);
        list_gold.setAdapter(adapter_gold);


        final ListView list_blue = (ListView) findViewById(R.id.listView2);
        final ArrayAdapter<String> adapter_blue = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, DateClass.listeBlueString);
        list_blue.setAdapter(adapter_blue);


        final ListView list_green = (ListView) findViewById(R.id.listView3);
        final ArrayAdapter<String> adapter_green = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, DateClass.listeGreenString);
        list_green.setAdapter(adapter_green);


        final ListView list_black = (ListView) findViewById(R.id.listView4);
        final ArrayAdapter<String> adapter_black = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, DateClass.listeBlackString);
        list_black.setAdapter(adapter_black);


        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                adapter_gold.clear();
                adapter_blue.clear();
                adapter_green.clear();
                adapter_black.clear();
                finish();
            }

        });


        button3 = (Button) findViewById(R.id.button3);


        for (Date ausgabe : DateClass.listeGoldSearch) {

            if (cuurentTime.getDate() + 1 == ausgabe.getDate()) {

                temp = 1;

                button3.setText("Gelbe und blaue Tonne mussen morgen raus ");

            }
        }


        for (Date ausgabe : DateClass.listeGreenSearch) {

            if (cuurentTime.getDate() + 1 == ausgabe.getDate()) {
                temp = 2;
                button3.setText("Grüne Tonne muss morgen raus");

            }
        }

        for (Date ausgabe : DateClass.listeBlackSearch) {

            if (cuurentTime.getDate() + 1 == ausgabe.getDate()) {
                temp = 3;
                button3.setText("Schwarze Tonne muss morgen raus");

            }
        }


        if (temp == 1) {

            Context context = getApplicationContext();
            Resources res = context.getResources();
            NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
            mBuilder.setSmallIcon(R.drawable.ic_launcher);
            mBuilder.setLargeIcon(decodeResource(res, R.drawable.ic_launcher));
            mBuilder.setTicker("Du, faulenzer ;)");
            mBuilder.setContentTitle("Vergiss nicht !!!");
            mBuilder.setContentText("Gelbe und blaue tonne sind morgen zu entleeren !!!");
            mBuilder.setDefaults(Notification.DEFAULT_ALL);
            // mBuilder.setPriority(NotificationCompat.PRIORITY_MAX);
// Creates an explicit intent for an Activity in your app
            Intent resultIntent = new Intent(this, OutActivity.class);


// The stack builder object will contain an artificial back stack for the
// started Activity.
// This ensures that navigating backward from the Activity leads out of
// your application to the Home screen.
            TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
// Adds the back stack for the Intent (but not the Intent itself)
            stackBuilder.addParentStack(OutActivity.class);
// Adds the Intent that starts the Activity to the top of the stack
            stackBuilder.addNextIntent(resultIntent);
            PendingIntent resultPendingIntent =
                    stackBuilder.getPendingIntent(
                            0,
                            PendingIntent.FLAG_UPDATE_CURRENT

                    );
            mBuilder.setContentIntent(resultPendingIntent);
            NotificationManager mNotificationManager =
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            //  (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
// mId allows you to update the notification later on.
            mNotificationManager.notify(NOTIFY_ID, mBuilder.build());
        }


        if (temp == 2) {


            Context context = getApplicationContext();
            Resources res = context.getResources();
            NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
            //  mBuilder.setSmallIcon(R.drawable.ic_launcher_cat);
            mBuilder.setLargeIcon(decodeResource(res, R.drawable.ic_launcher_cat));
            mBuilder.setTicker("Du, faulenzer ;)");
            mBuilder.setContentTitle("Vergiss nicht !!!");
            mBuilder.setContentText("Güne tonne ist morgen zu entleeren !!!");
            mBuilder.setDefaults(Notification.DEFAULT_ALL);
            //  mBuilder.setPriority(NotificationCompat.PRIORITY_MAX);
// Creates an explicit intent for an Activity in your app
            Intent resultIntent = new Intent(this, OutActivity.class);

// The stack builder object will contain an artificial back stack for the
// started Activity.
// This ensures that navigating backward from the Activity leads out of
// your application to the Home screen.
            TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
// Adds the back stack for the Intent (but not the Intent itself)
            stackBuilder.addParentStack(OutActivity.class);
// Adds the Intent that starts the Activity to the top of the stack
            stackBuilder.addNextIntent(resultIntent);
            PendingIntent resultPendingIntent =
                    stackBuilder.getPendingIntent(0,
                            PendingIntent.FLAG_UPDATE_CURRENT
                    );
            mBuilder.setContentIntent(resultPendingIntent);
            NotificationManager mNotificationManager =
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
// mId allows you to update the notification later on.
            mNotificationManager.notify(NOTIFY_ID, mBuilder.build());


        }


        if (temp == 3) {


            Context context = getApplicationContext();
            Resources res = context.getResources();
            NotificationCompat.Builder mBuilder =
                    new NotificationCompat.Builder(this)
                            .setSmallIcon(R.drawable.icon_notification_a_hdpi)
                            .setLargeIcon(decodeResource(res, R.drawable.icon_notification_a_hdpi))
                            .setTicker("Du, faulenzer ;)")
                            .setContentTitle("Vergiss nicht !!!")
                            .setContentText("Schwarze tonne ist morgen zu entleeren !!!")
                            .setDefaults(Notification.DEFAULT_ALL);
            // .setPriority(NotificationCompat.PRIORITY_MAX)

// Creates an explicit intent for an Activity in your app
            Intent resultIntent = new Intent(this, OutActivity.class);

// The stack builder object will contain an artificial back stack for the
// started Activity.
// This ensures that navigating backward from the Activity leads out of
// your application to the Home screen.
            TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
// Adds the back stack for the Intent (but not the Intent itself)
            stackBuilder.addParentStack(OutActivity.class);
// Adds the Intent that starts the Activity to the top of the stack
            stackBuilder.addNextIntent(resultIntent);
            PendingIntent resultPendingIntent =
                    stackBuilder.getPendingIntent(
                            0,
                            PendingIntent.FLAG_UPDATE_CURRENT
                    );
            mBuilder.setContentIntent(resultPendingIntent);
            NotificationManager mNotificationManager =
                    // (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
// mId allows you to update the notification later on.
            mNotificationManager.notify(NOTIFY_ID, mBuilder.build());
        }

        if (temp == 0) {
            button3.setText("Keine Tonne muss morgen raus");
        }


    }
}


