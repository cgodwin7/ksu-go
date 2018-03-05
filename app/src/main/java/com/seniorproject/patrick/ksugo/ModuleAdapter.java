package com.seniorproject.patrick.ksugo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by patri on 2/21/2018.
 */

public class ModuleAdapter extends ArrayAdapter<Button> {

    public ModuleAdapter(@NonNull Context context, ArrayList<Button> modules) {
        super(context, R.layout.module_button_layout, modules);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.module_button_layout, parent, false);
        Button button = getItem(position);
        Button moduleButton = (Button) view.findViewById(R.id.module_button);
        moduleButton = button;
        return view;

    }
}


