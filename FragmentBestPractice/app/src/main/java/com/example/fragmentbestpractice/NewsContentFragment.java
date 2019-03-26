package com.example.fragmentbestpractice;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NewsContentFragment extends Fragment {
    private View view;


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.news_content_frag,container,false);
        return view;
    }

    public void refresh(String newstitle,String newscontent){
        View visibilityLayout=view.findViewById(R.id.visibility_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView newsTitle=(TextView)view.findViewById(R.id.news_title);
        TextView newsContent=(TextView)view.findViewById(R.id.news_content);
        newsTitle.setText(newstitle);
        newsContent.setText(newscontent);
        

    }
}
