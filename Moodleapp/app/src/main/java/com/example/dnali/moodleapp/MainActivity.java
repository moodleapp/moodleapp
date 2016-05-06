package com.example.dnali.moodleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private EditText textUsername;
    private EditText textPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textUsername = (EditText)findViewById(R.id.ET_username);
        textPassword = (EditText) findViewById(R.id.ET_password);
        Button login = (Button) findViewById(R.id.b_login);

       login.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), taskActivity.class);
               //              intent.putExtra(SUCCESS_KEY, isSuccess());
               startActivity(intent);
               overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
           }
       });
    }


}
