package com.example.servicebestpractice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class DownloadService extends Service {
    private DownloadTask downloadTask;
    private String downloadUrl;
    private MainActivity.DownloadListener listener=new MainActivity.DownloadListener() {
        @Override
        public void onProgress(int Progress) {
            getNotificationManager()
        }

        @Override
        public void onSuccess() {

        }

        @Override
        public void onFailed() {

        }

        @Override
        public void onPaused() {

        }

        @Override
        public void onCanceled() {

        }
    }
    public DownloadService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
