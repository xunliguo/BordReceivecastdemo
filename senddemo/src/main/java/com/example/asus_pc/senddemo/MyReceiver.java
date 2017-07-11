package com.example.asus_pc.senddemo;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String key = intent.getStringExtra("key");
        Toast.makeText(context, "这是发送的"+key, Toast.LENGTH_SHORT).show();
    }
}
