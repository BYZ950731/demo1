package com.example.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"on create");
        setContentView(R.layout.activity_main);
        if (savedInstanceState!=null)
        {
            String tempdata=savedInstanceState.getString("data_key");
            Log.d(TAG,tempdata);

        }
        Button startnormalactivity =(Button)findViewById(R.id.start_normal_activity);
        Button startdialogactivity =(Button)findViewById(R.id.start_dialog_activity);

        startnormalactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
            }
        });

        startdialogactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"on destory");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"on restart");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempdata="Something you just typed";
        outState.putString("data_key","tempData");
    }
}
