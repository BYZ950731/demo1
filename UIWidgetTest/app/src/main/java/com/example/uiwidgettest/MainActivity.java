package com.example.uiwidgettest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private EditText editText;
     private ImageView imageView;
     int image[]={R.drawable.if_watermelon_2003190,R.drawable.if_lemon_2003191,R.drawable.if_orange_2003192,R.drawable.if_apple_2003193,R.drawable.if_grapes_2003194,R.drawable.if_pomegranate_2003195,
     R.drawable.if_pear_2003196,R.drawable.if_pineapple_2003197,R.drawable.if_mango_2003198,R.drawable.if_strawberry_2003199};
     int i=0;
     private ProgressBar progressBar;
    int progress=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Button button1 =(Button)findViewById(R.id.button_1);
        Button button2 =(Button)findViewById(R.id.button_2);
        Button button3 =(Button)findViewById(R.id.button_3);
        Button button4=(Button)findViewById(R.id.button_4);
        editText=(EditText)findViewById(R.id.edit_1);
        imageView=(ImageView)findViewById(R.id.image_1);
        progressBar=(ProgressBar)findViewById(R.id.progressbar_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_1:
                           String inputtext=editText.getText().toString();
                           Toast.makeText(MainActivity.this,inputtext,Toast.LENGTH_SHORT).show();
                           break;

                    default:
                        break;
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_2:
                             if(i<=9)
                             imageView.setImageResource(image[i++]);
                             else {
                                 i = 0;
                                 imageView.setImageResource(image[i++]);
                             }
                             break;
                    default:
                        break;
                }
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                if(progressBar.getVisibility()==View.GONE)
                    progressBar.setVisibility(View.VISIBLE);
                else
                    progressBar.setVisibility(View.GONE);
                */
                if(progressBar.getProgress()<=90)
                 {
                    progress=progress+10;
                 }
                else
                {
                    progress=0;
                 }
                progressBar.setProgress(progress);

            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is a dialog");
                dialog.setMessage("Something important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
            }
        });



    }
}
