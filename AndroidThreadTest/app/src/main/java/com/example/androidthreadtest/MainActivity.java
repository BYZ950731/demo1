package com.example.androidthreadtest;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int UPDATA_TEXT=1;
    private TextView textView;
    private Handler handler=new Handler(){
        public void handleMessage(Message msg){
            switch (msg.what){
                case UPDATA_TEXT:
                    textView.setText("Nice to meet you!");
                    break;
                 default:
                     break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.text_view);
        Button changeText=(Button)findViewById(R.id.change_text);
        changeText.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
          switch (v.getId()){
              case R.id.change_text:
              new Thread(new Runnable() {
                  @Override
                  public void run() {
                      Message message=new Message();
                      message.what=UPDATA_TEXT;
                      handler.sendMessage(message);

                  }
              }).start();
              break;
              default:
                  break;

          }
    }


    class DownloadTask extends AsyncTask<Void,Integer,Boolean>{
        @Override
        protected void onPreExecute() {

            // super.onPreExecute();
        }

        @Override
        protected Boolean doInBackground(Void... params) {
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
        }
    }
}
