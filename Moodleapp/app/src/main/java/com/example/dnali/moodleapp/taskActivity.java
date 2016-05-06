package com.example.dnali.moodleapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;

import java.util.LinkedList;
import java.util.List;

import MoodleDemo.Assignment;
import MoodleDemo.Moodle;

public class taskActivity extends AppCompatActivity{

    private  Moodle moodleUser;
    private ListView taskList;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        moodleUser = moodleInstance.getInstance();
        taskList = (ListView) findViewById(R.id.listView);

        // Create a progress bar to display while the list loads
        ProgressBar progressBar = new ProgressBar(this);
        progressBar.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
        progressBar.setIndeterminate(true);
        taskList.setEmptyView(progressBar);

        // Must add the progress bar to the root of the layout
        ViewGroup root = (ViewGroup) findViewById(android.R.id.content);
        root.addView(progressBar);


        //test array
        List<String> assignmentname = new LinkedList<>();
        List<Assignment> assignmentList = moodleUser.getAllAssignments();

        for (Assignment assign : assignmentList) {
           String s = assign.getName();
            assignmentname.add(s);
        }

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, assignmentname);
        ListView taskList = (ListView) findViewById(R.id.listView);
        taskList.setAdapter(adp);
        //taskList.
    }
}
