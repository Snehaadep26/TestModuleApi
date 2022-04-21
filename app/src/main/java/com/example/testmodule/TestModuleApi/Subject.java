package com.example.testmodule.TestModuleApi;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Subject {
    public int subjectId;
    public String subjectName;
    public String icon;
    public int subjectiveCount;
    public int objectiveCount;
}
