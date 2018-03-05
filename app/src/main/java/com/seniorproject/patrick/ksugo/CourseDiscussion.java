package com.seniorproject.patrick.ksugo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CourseDiscussion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_discussions);
       TextView textView=(TextView) findViewById(R.id.courseDiscussionsText);
        textView.setText(String.format("%s Discussions", D2L.selectedCourse));
    }


    public void onClick(View view) {
        finish();
        //startActivity(new Intent(CourseDiscussion.this,D2L.class));

    }

}
