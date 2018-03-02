package com.seniorproject.patrick.ksugo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CourseAnnouncements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_annoucements);
    }


    public void onClick(View view) {
        finish();
//        startActivity(new Intent(CourseAnnouncements.this,D2L.class));

    }

}
