package com.example.testmodule.TestModuleApi;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Item {
    public int test_id;
    public int testQuestions_id;
    public String statement;
    public String type;
    public String options;
    public String correctAnswer;
    public String solution;
    public int positiveMarks;
    public int negativeMarks;
    public String subjectName;
    public Object answer;
    public Object filename;
    public Object submitStatus;
    public Object comment;
    public Object marksObtained;
    public Object duration;
    public Object correct;
}
