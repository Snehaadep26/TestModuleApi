package com.example.testmodule.TestModuleApi;

import java.util.ArrayList;

public class GetSyllabuswiseTestResponse {
    public ArrayList<Subject> subjects;
    public int combinedObjective;
    public int combinedSubjective;
    public String combinedIcon;

    public GetSyllabuswiseTestResponse(ArrayList<Subject> subjects, int combinedObjective, int combinedSubjective, String combinedIcon) {
        this.subjects = subjects;
        this.combinedObjective = combinedObjective;
        this.combinedSubjective = combinedSubjective;
        this.combinedIcon = combinedIcon;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public int getCombinedObjective() {
        return combinedObjective;
    }

    public int getCombinedSubjective() {
        return combinedSubjective;
    }

    public String getCombinedIcon() {
        return combinedIcon;
    }
}


