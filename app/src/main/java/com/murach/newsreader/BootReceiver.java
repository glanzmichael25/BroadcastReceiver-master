package com.murach.newsreader;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootReceiver extends BroadcastReceiver{
    @Override
    public void onReceive (Context context, Intent intent){
        Log.d("News reader", "Bood completed");

        //start the service
        Intent service = new Intent(context, NewsReaderService.class);
        context.stopService(service);
    }

}