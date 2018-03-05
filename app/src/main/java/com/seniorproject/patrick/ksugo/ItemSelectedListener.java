package com.seniorproject.patrick.ksugo;

import android.view.View;
import android.widget.AdapterView;

/**
 * Created by patri on 3/4/2018.
 */

public class ItemSelectedListener implements AdapterView.OnItemSelectedListener {

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        D2L.selectedCourse = adapterView.getItemAtPosition(i).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
