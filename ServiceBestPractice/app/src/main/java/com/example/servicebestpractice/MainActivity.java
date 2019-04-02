package com.example.servicebestpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public interface DownloadListener{
        void onProgress(int Progress);
        void onSuccess();
        void onFailed();
        void onPaused();
        void onCanceled();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
