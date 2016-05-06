package com.example.dnali.moodleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    public static final String SUCCESS_KEY = "success";
    private EditText textUsername;
    private EditText textPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        textUsername = (EditText)findViewById(R.id.ET_username);
        textPassword = (EditText) findViewById(R.id.ET_password);
        Button login = (Button) findViewById(R.id.b_login);

       login.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               if (isSuccess()) {
                   Intent intent = new Intent(MainActivity.this, taskActivity.class);
//               intent.putExtra(SUCCESS_KEY, isSuccess());
                   startActivity(intent);
//               overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
               }
               else {
                   Intent intent = new Intent(MainActivity.this, failLogin.class);
               }
           }
       });
    }

    private boolean isSuccess() {
        return true;
    }


}
