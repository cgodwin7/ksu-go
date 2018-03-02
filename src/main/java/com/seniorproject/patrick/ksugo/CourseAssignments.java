package com.seniorproject.patrick.ksugo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CourseAssignments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_assignments);
    }


    public void onClick(View view) {
        finish();
//        startActivity(new Intent(CourseAssignments.this,D2L.class));

    }

}
