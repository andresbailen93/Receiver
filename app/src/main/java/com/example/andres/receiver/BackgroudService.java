package com.example.andres.receiver;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

public class BackgroudService extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("pulsador 1")) {
            Log.e("RECEIVER", intent.getAction());
        }
        if(intent.getAction().equals("pulsador 2")) {
            Log.e("RECEIVER", intent.getAction());
        }
    }
}
