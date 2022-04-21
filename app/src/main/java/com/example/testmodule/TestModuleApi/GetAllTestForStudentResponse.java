package com.example.testmodule.TestModuleApi;

import java.util.ArrayList;
import java.util.Date;


public class GetAllTestForStudentResponse {
    public int testsAvailable;
    public int missed;
    public ArrayList<Syllabus> syllabuses;
    public ArrayList<StudentTest> studentTests;
    public ArrayList<AttemptedTest> attemptedTests;
    public ArrayList<Object> publishedResults;
    public OnGoingLiveTest onGoingLiveTest;
    public ArrayList<Object> upcomingLiveTest;

    public GetAllTestForStudentResponse(int testsAvailable, int missed, ArrayList<Syllabus> syllabuses, ArrayList<StudentTest> studentTests, ArrayList<AttemptedTest> attemptedTests, ArrayList<Object> publishedResults, OnGoingLiveTest onGoingLiveTest, ArrayList<Object> upcomingLiveTest) {
        this.testsAvailable = testsAvailable;
        this.missed = missed;
        this.syllabuses = syllabuses;
        this.studentTests = studentTests;
        this.attemptedTests = attemptedTests;
        this.publishedResults = publishedResults;
        this.onGoingLiveTest = onGoingLiveTest;
        this.upcomingLiveTest = upcomingLiveTest;
    }

    public int getTestsAvailable() {
        return testsAvailable;
    }

    public int getMissed() {
        return missed;
    }

    public ArrayList<Syllabus> getSyllabuses() {
        return syllabuses;
    }

    public ArrayList<StudentTest> getStudentTests() {
        return studentTests;
    }

    public ArrayList<AttemptedTest> getAttemptedTests() {
        return attemptedTests;
    }

    public ArrayList<Object> getPublishedResults() {
        return publishedResults;
    }

    public OnGoingLiveTest getOnGoingLiveTest() {
        return onGoingLiveTest;
    }

    public ArrayList<Object> getUpcomingLiveTest() {
        return upcomingLiveTest;
    }
}

