package com.seniorproject.patrick.ksugo;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class CourseContent extends AppCompatActivity {
private ArrayList<Button>module=new ArrayList<Button>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_content);
    }


    public void onClick(View view) {
    finish();
    }

    public void addModule(View view){
            ArrayList<Button> modules=new ArrayList<Button>();
            modules.add(new Button(getApplicationContext()));
            modules.get(0).setText("Module 1");
            ListAdapter adapter = new ArrayAdapter<Button>(this,R.layout.module_button_layout,R.id.module_button, modules);
            ListView listView=(ListView) view.findViewById(R.id.modules);

            listView.setAdapter(adapter);
        }
    }

