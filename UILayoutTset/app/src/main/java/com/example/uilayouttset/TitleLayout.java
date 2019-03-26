package com.example.uilayouttset;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.uilayouttset.R;

public class TitleLayout extends LinearLayout {

    public TitleLayout(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button titleback=(Button)findViewById(R.id.title_back);
        Button titleedit=(Button)findViewById(R.id.title_edit);
        titleback.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        titleedit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"You click edit button",Toast.LENGTH_SHORT).show();
            }
        });


    }


}