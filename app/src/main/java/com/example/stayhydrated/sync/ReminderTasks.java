package com.example.stayhydrated.sync;


import android.content.Context;

import com.example.stayhydrated.utilities.NotificationUtils;
import com.example.stayhydrated.utilities.PreferenceUtilities;

// COMPLETED (1) Create a class called ReminderTasks
public class ReminderTasks {
    public static final String ACTION_INCREMENT_WATER_COUNT = "increment-water-count";
    //  COMPLETED (2) Add a public static constant called ACTION_DISMISS_NOTIFICATION
    public static final String ACTION_DISMISS_NOTIFICATION = "dismiss-notification";

    public static void executeTask(Context context, String action) {
        if (ACTION_INCREMENT_WATER_COUNT.equals(action)) {
            incrementWaterCount(context);
        } else if (ACTION_DISMISS_NOTIFICATION.equals(action)) {
            NotificationUtils.clearAllNotifications(context);
        }
        //      COMPLETED (3) If the user ignored the reminder, clear the notification
    }

    private static void incrementWaterCount(Context context) {
        PreferenceUtilities.incrementWaterCount(context);
        //      COMPLETED (4) If the water count was incremented, clear any notifications
        NotificationUtils.clearAllNotifications(context);
    }
}
