package com.example.testmodule.TestModuleApi;

import java.util.ArrayList;
import java.util.Date;

public class Question {
    public int id;
    public String statement;
    public String type;
    public ArrayList<Option> options;
    public int positiveMarks;
    public int negativeMarks;
    public Object details;
    public String remark;
    public boolean markedForReview;
    public Date createdAt;
    public int testId;
    public Test test;
    public Object attempt;
    public Chapter chapter;
}
