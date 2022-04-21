package com.example.testmodule.TestModuleApi;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class GetChapterTestResponse {
    public int chapterId;
    public String chapterName;
    public int subjectiveCount;
    public int objectiveCount;

    public GetChapterTestResponse(int chapterId, String chapterName, int subjectiveCount, int objectiveCount) {
        this.chapterId = chapterId;
        this.chapterName = chapterName;
        this.subjectiveCount = subjectiveCount;
        this.objectiveCount = objectiveCount;
    }

    public int getChapterId() {
        return chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public int getSubjectiveCount() {
        return subjectiveCount;
    }

    public int getObjectiveCount() {
        return objectiveCount;
    }
}

