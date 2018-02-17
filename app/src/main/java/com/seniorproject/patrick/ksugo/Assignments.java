package com.seniorproject.patrick.ksugo;

/**
 * Created by patri on 2/14/2018.
 */

public class Assignments {
    private String courseName;
    private String dueDate;
    private String assignmentName;
    private String dueTime;



    public Assignments(String courseName, String dueDate, String assignmentName, String dueTime) {

        this.courseName = courseName;
        this.dueDate = dueDate;
        this.assignmentName = assignmentName;
        this.dueTime=dueTime;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }
    public String getDueTime() {
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public String toString(){
        return courseName+"  "+assignmentName+"  "+dueTime;
    }


}
