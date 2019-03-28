package com.example.broadcastbestpractice;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private EditText accountEdit;
    private EditText passwordEdit;
    private Button login;
    private CheckBox rempass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        preferences=PreferenceManager.getDefaultSharedPreferences(this);
        accountEdit=(EditText)findViewById(R.id.account);
        passwordEdit=(EditText)findViewById(R.id.password);
        rempass=(CheckBox)findViewById(R.id.remember_pass);
        login=(Button)findViewById(R.id.login);
        boolean isRemember=preferences.getBoolean("remember_pass",false);
        if(isRemember){
            String account=preferences.getString("account","");
            String password=preferences.getString("password","");
            accountEdit.setText(account);
            passwordEdit.setText(password);
            rempass.setChecked(true);
        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account=accountEdit.getText().toString();
                String password=passwordEdit.getText().toString();
                if(account.equals("admin")&& password.equals("123456")){

                    editor=preferences.edit();
                    if (rempass.isChecked()){
                        editor.putBoolean("remember_pass",true);
                        editor.putString("account",account);
                        editor.putString("password",password);
                    }
                    else {
                        editor.clear();
                    }
                    editor.apply();
                    Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                    Toast.makeText(LoginActivity.this,"success",Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(LoginActivity.this,"account or password is error",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
