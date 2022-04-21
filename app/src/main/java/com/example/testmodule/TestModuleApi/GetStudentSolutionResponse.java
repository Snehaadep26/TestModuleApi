package com.example.testmodule.TestModuleApi;


import java.util.ArrayList;

public class GetStudentSolutionResponse {
    public ArrayList<Item> items;
    public int correctCount;
    public int inCorrectCount;
    public int partialCorrectCount;
    public int unattemptedCount;
    public int unSeenCount;
    public Links links;
    public Meta meta;

    public GetStudentSolutionResponse(ArrayList<Item> items, int correctCount, int inCorrectCount, int partialCorrectCount, int unattemptedCount, int unSeenCount, Links links, Meta meta) {
        this.items = items;
        this.correctCount = correctCount;
        this.inCorrectCount = inCorrectCount;
        this.partialCorrectCount = partialCorrectCount;
        this.unattemptedCount = unattemptedCount;
        this.unSeenCount = unSeenCount;
        this.links = links;
        this.meta = meta;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getCorrectCount() {
        return correctCount;
    }

    public int getInCorrectCount() {
        return inCorrectCount;
    }

    public int getPartialCorrectCount() {
        return partialCorrectCount;
    }

    public int getUnattemptedCount() {
        return unattemptedCount;
    }

    public int getUnSeenCount() {
        return unSeenCount;
    }

    public Links getLinks() {
        return links;
    }

    public Meta getMeta() {
        return meta;
    }
}

