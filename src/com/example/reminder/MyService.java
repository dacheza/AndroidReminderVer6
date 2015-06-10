package com.example.reminder;

/**
 * Created by Oleksandra on 21.04.2015.
 */
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.util.concurrent.TimeUnit;

public class MyService extends Service {
    NotificationManager nm;


    @Override
    public void onCreate() {
        super.onCreate();
        nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sendNotif();


        return super.onStartCommand(intent, flags, startId);
    }


    void sendNotif() {
        // 1-я часть
        Notification notif = new Notification(R.drawable.icon_notification_1_hdpi, "Du, faulenzer ;)",
                System.currentTimeMillis());

        // 3-я часть
        Intent intent = new Intent(this, OutActivity.class);
        //  intent.putExtra(MainActivity.FILE_NAME, "somefile");
        PendingIntent pIntent = PendingIntent.getActivity(this, 0, intent, 0);

        // 2-я часть
        notif.setLatestEventInfo(this, "Haushalt !!!", "Müllabfuhr checken ", pIntent);

        // ставим флаг, чтобы уведомление пропало после нажатия
        notif.flags |= Notification.FLAG_AUTO_CANCEL;

        // отправляем
        nm.notify(1, notif);
    }

    public IBinder onBind(Intent arg0) {
        return null;
    }
}