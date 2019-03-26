package com.example.mybroadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private IntentFilter intentFilter;
    private  LocalReceiver localRecevier;
    private LocalBroadcastManager localBroadcastManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        localBroadcastManager=LocalBroadcastManager.getInstance(this);//获取实例
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.mybroadcasttest.LOCAL_BROADCAST");
            //    sendBroadcast(intent);
                localBroadcastManager.sendBroadcast(intent);
            }
        });
        intentFilter =new IntentFilter();
        intentFilter.addAction("com.example.mybroadcasttest.LOCAL_BROADCAST");
        localRecevier=new LocalReceiver();
        localBroadcastManager.registerReceiver(localRecevier,intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        localBroadcastManager.unregisterReceiver(localRecevier);
    }

    class LocalReceiver extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context,"received local",Toast.LENGTH_SHORT).show();
        }
    }
}
