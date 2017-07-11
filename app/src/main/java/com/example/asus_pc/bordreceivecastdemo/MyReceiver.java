package com.example.asus_pc.bordreceivecastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String key = intent.getStringExtra("key");
        MainActivity.text.setText(key);
        Toast.makeText(context, "我发的内容是:::::::::::"+key, Toast.LENGTH_SHORT).show();
    }


}
