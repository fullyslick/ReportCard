package com.example.android.reportcard;

/**
 * Created by Alexander Rashkov on 15.5.2017 г..
 */

public class ReportCard {
    //variable that stores the name of the subject
    private String mSubject;

    //variable that stores the grade on this subject
    private int mGrade;

    //construct the ReportCard class
    public ReportCard(String subject, int grade) {
        mSubject = subject;
        mGrade = grade;
    }

    //this method gets the name of the subject
    public String getSubject() {
        return mSubject;
    }

    //this method sets the name of the subject
    public void setSubject(String subject) { mSubject = subject; }

    //this method gets the grade on the subject above
    public int getGrade() {
        return mGrade;
    }

    //this method sets the name of the subject
    public void setGrade(int grade) {
        mGrade = grade;
    }

    //
    @Override
    public String toString() {
        return  "Subject:" + mSubject + "\n" +
                "Grade:" + mGrade;
    }
}
