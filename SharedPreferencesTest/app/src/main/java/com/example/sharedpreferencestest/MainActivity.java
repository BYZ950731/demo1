package com.example.sharedpreferencestest;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button save=(Button)findViewById(R.id.button);
        Button restore=(Button)findViewById(R.id.button1);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=getSharedPreferences("data",MODE_PRIVATE).edit();
                editor.putString("name","Tom");
                editor.putInt("age",28);
                editor.putBoolean("married",false);
                editor.apply();
            }
        });

        restore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences=getSharedPreferences("data",MODE_PRIVATE);
                String name=preferences.getString("name","Mike");
                int age=preferences.getInt("age",0);
                boolean married=preferences.getBoolean("married",false);
                Log.d("MainActivity","name is "+name);
                Log.d("MainActivity","age is "+age);
                Log.d("MainActivity","married is "+married);

            }
        });
    }
}
