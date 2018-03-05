package com.seniorproject.patrick.ksugo;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

public class D2L extends AppCompatActivity implements CoursesFrag.OnFragmentInteractionListener,AssignmentsFrag.OnFragmentInteractionListener,
        NewsFrag.OnFragmentInteractionListener{

    private TabLayout tabLayout;
    private TabItem news;
    private ViewPager viewPager;
    private Button assignment;
    private Button courseContent;
    private Button grades;
    private Button discussions;
    private Button annoucements;
    public static ArrayList<Course> courses1=new ArrayList<Course>();
    public static String selectedCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d2_l);
        tabLayout = (TabLayout) findViewById(R.id.all_tabs);
        news = (TabItem) findViewById(R.id.news);
        final FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(adapter);

        insertCourses();

        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }

        });



    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
    public void onClick(View view){


        switch (view.getId()){
            case R.id.annoucementButton:{
                startActivity(new Intent(D2L.this, CourseAnnouncements.class));
                break;
            }
            case R.id.assignmentsButton:{
                startActivity(new Intent(D2L.this, CourseAssignments.class));

                break;
            }
            case R.id.contentButton:{
                startActivity(new Intent(D2L.this, CourseContent.class));

                break;
            }
            case R.id.discussionsButton:{
                startActivity(new Intent(D2L.this, CourseDiscussion.class));
                break;
            }
            case R.id.gradesButton:{
                startActivity(new Intent(D2L.this, CourseGrades.class));
                break;
            }
        }
    }

  public void insertCourses(){
        Assignments assignment1=new Assignments();
        Assignments assignment2=new Assignments();
        Assignments assignment3=new Assignments();
        Assignments assignment4=new Assignments();
        Assignments assignment5=new Assignments();

        assignment1.setAssignmentName("Quiz 1");
        assignment1.setDueDate("March 5th");
        assignment1.setDueTime("11:59pm");

          assignment2.setAssignmentName("Assignment 1");
          assignment2.setDueDate("March 10th");
          assignment2.setDueTime("11:59pm");

          assignment3.setAssignmentName("Test 1");
          assignment3.setDueDate("March 15th");
          assignment3.setDueTime("10:00pm");

          assignment4.setAssignmentName("Assignment 2");
          assignment4.setDueDate("March 20th");
          assignment4.setDueTime("11:59pm");

          assignment5.setAssignmentName("Essay");
          assignment5.setDueDate("March 25th");
          assignment5.setDueTime("11:59pm");
      assignment5.setAssignmentName("SDD");
      assignment5.setDueDate("Feb 22");
      assignment5.setDueTime("11:59pm");
        Course chemistry=new Course();
        Course internetProgramming=new Course();
        Course seniorProject=new Course();
        chemistry.setCourseID("chem1211");
        seniorProject.setCourseName("Senior Project");
        seniorProject.setCourseID("cs4850");
        internetProgramming.setCourseName("Internet Programming");
        internetProgramming.setCourseID("cs4720");
        chemistry.setCourseName("Chemistry");
        chemistry.addAssignment(assignment1);
        chemistry.addAssignment(assignment2);
        chemistry.addAssignment(assignment3);
        internetProgramming.addAssignment(assignment4);
        seniorProject.addAssignment(assignment5);
        courses1.add(chemistry);
        courses1.add(internetProgramming);
        courses1.add(seniorProject);


  }



}




