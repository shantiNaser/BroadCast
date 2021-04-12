package com.example.broadcasthw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class TestReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {

            Toast.makeText(context, "Air Plane Mode was Changed", Toast.LENGTH_LONG).show();
        }

       else if(intent.getAction().equals(Intent.ACTION_BATTERY_CHANGED)) {

            Toast.makeText(context, "Battery percentage was Changed", Toast.LENGTH_LONG).show();
        }

        else if(intent.getAction().equals(Intent.ACTION_NEW_OUTGOING_CALL))
        {
            Toast.makeText(context, "The Phone now is Ringing", Toast.LENGTH_LONG).show();
        }

        else if(intent.getAction().equals(WifiManager.WIFI_STATE_CHANGED_ACTION))
        {
            Toast.makeText(context, "The Wifi States was Changed", Toast.LENGTH_LONG).show();
        }

        else if(intent.getAction().equals(Intent.ACTION_LOCALE_CHANGED)) {

            Toast.makeText(context, "Locale  was Changed", Toast.LENGTH_LONG).show();
        }

        else if(intent.getAction().equals(Intent.ACTION_TIME_CHANGED)) {

            Toast.makeText(context, "Note the Time was Changed Manually", Toast.LENGTH_LONG).show();
        }
        else if(intent.getAction().equals(Intent.ACTION_DATE_CHANGED)) {

            Toast.makeText(context, "Note the Date was Changed Manually", Toast.LENGTH_LONG).show();
        }

        else if(intent.getAction().equals(Intent.ACTION_TIME_TICK))
        {
            Toast.makeText(context, "Note the Time was Changed Automatically", Toast.LENGTH_LONG).show();
        }

        else if(intent.getAction().equals(TelephonyManager.ACTION_PHONE_STATE_CHANGED)) {

            int save = intent.getIntExtra(TelephonyManager.EXTRA_STATE,123);

            if(save==TelephonyManager.CALL_STATE_RINGING)
            {
                Toast.makeText(context, "Note Your Mobile is now Ringing", Toast.LENGTH_LONG).show();
            }

        }



    }
}
