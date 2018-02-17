package com.seniorproject.patrick.ksugo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Patrick on 2/11/2018.
 */

public class FragmentAdapter extends FragmentStatePagerAdapter {
    private int numOfTabs;

    public FragmentAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs=numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: NewsFrag newsFragment= new NewsFrag();
            return newsFragment;
            case 1: AssignmentsFrag assignmentFragment=new AssignmentsFrag();
            return assignmentFragment;
            case 2: CoursesFrag coursesFragment=new CoursesFrag();
            return coursesFragment;
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}

