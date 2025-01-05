package com.example.onlinenurse;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        // Show a notification when the alarm goes off
        NotificationUtils.showNotification(context, "Alarm Triggered", "It's 6:10!");
    }
}

