package com.seniorproject.patrick.ksugo;

import android.net.Uri;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TableLayout;

import java.util.ArrayList;

public class D2L extends AppCompatActivity  implements CoursesFrag.OnFragmentInteractionListener,AssignmentsFrag.OnFragmentInteractionListener,NewsFrag.OnFragmentInteractionListener{
private TabLayout tabLayout;
    private TabItem news;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_d2_l);
        tabLayout= (TabLayout) findViewById(R.id.all_tabs);
        news=(TabItem) findViewById(R.id.news);
        viewPager=(ViewPager) findViewById(R.id.container);
        final FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
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




}
