package com.khnkoyan.carapplication.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkUtils {
    public static boolean isNetworkAvailable(Context context, boolean allowWithWifiOnly) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activityNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean isConnected = activityNetworkInfo != null && activityNetworkInfo.isConnected();
        NetworkInfo activeNetworkViviInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        return (isConnected && ((activeNetworkViviInfo.isConnected() && allowWithWifiOnly) || !allowWithWifiOnly));
    }
}
