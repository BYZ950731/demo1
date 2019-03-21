package com.example.activitytest;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private static Toast mToast ;
    public static   void showToast( Context context,String msg) {

        if (mToast == null) {
            mToast =Toast.makeText(context,msg,Toast.LENGTH_SHORT);

        }
        else {
            mToast.setText(msg);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                showToast(FirstActivity.this,"You Click Add");


                break;
            case R.id.remove_item:
                showToast(FirstActivity.this,"You Click Remove");

                break;
            default:

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1= (Button) findViewById(R.id.button_1);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent=new Intent("com.example.activitytest.ACTION_START");
                    intent.addCategory("com.example.activitytest.MY_CATEGORY");
                    startActivity(intent);

              //  } catch (Exception e) {
                //    e.printStackTrace();
                 //   Log.e("XXX", e.toString());
                }


                //showToast(FirstActivity.this,"You Click 计算器");



            });

        };
    }

