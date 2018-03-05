package com.seniorproject.patrick.ksugo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CourseAssignments extends AppCompatActivity {
    private ArrayList<Assignments> assignments=new ArrayList<Assignments>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_assignments);

        addAssignment();

    }



    public void onClick(View view) {
        finish();
//        startActivity(new Intent(CourseAssignments.this,D2L.class));

    }
    public void addAssignment() {
        ArrayList<Course> courses = D2L.courses1;
        Course selectedCourse= new Course();
        for (Course course : courses) {
            if (course.getCourseName() == D2L.selectedCourse) {
                selectedCourse = course;
            }
        }
        ArrayList<String>assignmentInfo=new ArrayList<>();
        ArrayList<Assignments> assignmentsList=selectedCourse.getAssignments();

        if (selectedCourse.getAssignments().size()>0) {
            String string;

            for(int i=0;i<assignmentsList.size();i++){
                if(i==0){
                    assignmentInfo.add(assignmentsList.get(i).getDueDate());
                    string=assignmentsList.get(i).toString();
                    assignmentInfo.add(string);
                }
                else if(assignmentsList.get(i).getDueDate()==assignmentsList.get(i-1).getDueDate()){
                    assignmentInfo.add(assignmentsList.get(i).toString());
                }
                else {
                    assignmentInfo.add(assignmentsList.get(i).getDueDate());
                    string=assignmentsList.get(i).toString();
                    assignmentInfo.add(string);

                }
            }
            }
            ListAdapter adapter = new ArrayAdapter<String>(this, R.layout.assignment_layoutfile, R.id.textviewLayout, assignmentInfo);
            ListView listView = (ListView) findViewById(R.id.courseAssignementView);

            listView.setAdapter(adapter);
        }

    }


