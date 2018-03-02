package com.seniorproject.patrick.ksugo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AssignmentsFrag.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AssignmentsFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AssignmentsFrag extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private ArrayList<Assignments> assignments=new ArrayList<Assignments>();
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public AssignmentsFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CoursesFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static AssignmentsFrag newInstance(String param1, String param2) {
        AssignmentsFrag fragment = new AssignmentsFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        assignments.add(new Assignments("IT4823","Feb 14th","Quiz 4","11:59pm"));
        assignments.add(new Assignments("CS4720","Feb 14th","Assignment 2","11:59pm"));
        assignments.add(new Assignments("CHEM1211","Feb 15th","Periodic Table","10:00pm"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View view= inflater.inflate(R.layout.assignment_tab, container, false);
         addAssignment(view);
         return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    public void addAssignment(View view){
        if(assignments.size()!=0){
            ArrayList<String> assignmentInfo=new ArrayList<String>();
            for (int i=0;i<assignments.size();i++){
                if(i==0){
                    assignmentInfo.add(assignments.get(i).getDueDate());
                    assignmentInfo.add(assignments.get(i).toString());
                }
               else if(assignments.get(i).getDueDate()==assignments.get(i-1).getDueDate()){
                    assignmentInfo.add(assignments.get(i).toString());
                }
                else {
                    assignmentInfo.add(assignments.get(i).getDueDate());
                    assignmentInfo.add(assignments.get(i).toString());
                }
            }
            ListAdapter adapter = new ArrayAdapter<String>(getActivity(), R.layout.assignment_layoutfile,R.id.textviewLayout, assignmentInfo);
            ListView listView=(ListView) view.findViewById(R.id.assignmentsListView);

            listView.setAdapter(adapter);
        }
    }
}
