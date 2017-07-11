package com.example.asus_pc.bordreceivecastdemo;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;

    static TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
        text=(TextView)   findViewById(R.id.text);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                NotificationCompat.Builder build=new NotificationCompat.Builder(this);
                build.setContentTitle("你的广播发送的消息");
                Intent intent=new Intent();
                intent.putExtra("key","这是我发的广播");
                intent.setAction("com.test.broadCastFlag");
                sendBroadcast(intent);
                break;
        }
    }
}
