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
import android.widget.ArrayAdapter;
import android.widget.Button;


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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_d2_l);
        tabLayout = (TabLayout) findViewById(R.id.all_tabs);
        news = (TabItem) findViewById(R.id.news);
        final FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(adapter);
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

    public void onClickContent(View view) {
        startActivity(new Intent(D2L.this, CourseContent.class));

    }


    public void onClickAssignments(View view) {
        startActivity(new Intent(D2L.this, CourseAssignments.class));

    }

    public void onClickAnnouncements(View view) {
        startActivity(new Intent(D2L.this, CourseAnnouncements.class));

    }

    public void onClickGrades(View view) {
        startActivity(new Intent(D2L.this, CourseGrades.class));

    }

    public void onClickDiscussions(View view) {
        startActivity(new Intent(D2L.this, CourseDiscussion.class));

    }

}




