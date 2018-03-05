package com.seniorproject.patrick.ksugo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CourseAnnouncements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_annoucements);
      TextView  textView=(TextView) findViewById(R.id.courseAnnoucementsText);
        textView.setText(String.format("%s Announcements", D2L.selectedCourse));
    }


    public void onClick(View view) {
        finish();
//        startActivity(new Intent(CourseAnnouncements.this,D2L.class));

    }

}
