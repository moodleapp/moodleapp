package com.example.dnali.moodleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;

import java.util.List;

import Moodle.Assignment;

public class taskActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        //test array
        String[] a = {"a", "b", "c"};
        List<Assignment> assignmentList = m;

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, a);
        ListView taskList = (ListView) findViewById(R.id.listView);
        taskList.setAdapter(adp);
    }
}
