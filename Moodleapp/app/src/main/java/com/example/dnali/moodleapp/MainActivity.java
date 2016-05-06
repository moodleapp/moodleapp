package com.example.dnali.moodleapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private EditText textUsername;
    private EditText textPassword;
    private TextView Error;
    private LayoutInflater lI;
    private PopupWindow win;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textUsername = (EditText) findViewById(R.id.ET_username);
        textPassword = (EditText) findViewById(R.id.ET_password);
        Button login = (Button) findViewById(R.id.b_login);
        getSupportActionBar().hide();
       // getSupportActionBar().setDisplayShowHomeEnabled(true);
       // getSupportActionBar().setIcon(R.drawable.moodle);

       login.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               if (isSuccess()) {
                   Intent intent = new Intent(MainActivity.this, taskActivity.class);
//              intent.putExtra(SUCCESS_KEY, isSuccess());
                   startActivity(intent);
//               overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
               }
               else {
                   AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                   alert.setMessage("Incorrect Username or Password. Please try again")
                           .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                               @Override
                               public void onClick(DialogInterface dialog, int which) {
                                   dialog.dismiss();
                               }
                           }).setTitle("Error")
                           .setIcon(R.drawable.moodle)
                           .create();
                   alert.show();
              }
           }
       });
    }

    private boolean isSuccess() {
        return false;
    }


}
