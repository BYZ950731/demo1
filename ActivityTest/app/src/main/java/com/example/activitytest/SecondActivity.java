package com.example.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button back=(Button)findViewById(R.id.button_b);
        Button online=(Button)findViewById(R.id.button_s);
        Button geo=(Button)findViewById(R.id.button_geo);
        Button tel=(Button)findViewById(R.id.button_tel);
        Button cal=(Button)findViewById(R.id.button_call);
        Button msg=(Button)findViewById(R.id.button_msg);
        Button email=(Button)findViewById(R.id.button_ema);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        online.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.addCategory("android.intent.category.DEFAULT");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);

            }
        });

        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:18861807319"));
                startActivity(intent);
            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:18861807319"));
                startActivity(intent);
            }
        });

        geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:39.820015"));
                startActivity(intent);
            }
        });

        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:18861807319"));
                //intent.putExtra("sms_body","The SMS text");
                startActivity(intent);
            }
        });

    }
}
