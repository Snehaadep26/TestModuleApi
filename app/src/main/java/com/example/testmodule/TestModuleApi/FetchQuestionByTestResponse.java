package com.example.testmodule.TestModuleApi;

import java.util.ArrayList;
import java.util.Date;






public class FetchQuestionByTestResponse {
    public Question question;
    public Date testStartTimeUtc;
    public Date testEndTimeUtc;
    public int attempted;
    public int attemptedAndBookmarked;
    public int bookmarked;
    public int unanswered;
    public int unseen;
    public ArrayList<Matrix> matrix;
    public int matrixLength;
    public ArrayList<SubjectFQ> subjects;
    public Meta meta;

    public FetchQuestionByTestResponse(Question question, Date testStartTimeUtc, Date testEndTimeUtc, int attempted, int attemptedAndBookmarked, int bookmarked, int unanswered, int unseen, ArrayList<Matrix> matrix, int matrixLength, ArrayList<SubjectFQ> subjects, Meta meta) {
        this.question = question;
        this.testStartTimeUtc = testStartTimeUtc;
        this.testEndTimeUtc = testEndTimeUtc;
        this.attempted = attempted;
        this.attemptedAndBookmarked = attemptedAndBookmarked;
        this.bookmarked = bookmarked;
        this.unanswered = unanswered;
        this.unseen = unseen;
        this.matrix = matrix;
        this.matrixLength = matrixLength;
        this.subjects = subjects;
        this.meta = meta;
    }

    public Question getQuestion() {
        return question;
    }

    public Date getTestStartTimeUtc() {
        return testStartTimeUtc;
    }

    public Date getTestEndTimeUtc() {
        return testEndTimeUtc;
    }

    public int getAttempted() {
        return attempted;
    }

    public int getAttemptedAndBookmarked() {
        return attemptedAndBookmarked;
    }

    public int getBookmarked() {
        return bookmarked;
    }

    public int getUnanswered() {
        return unanswered;
    }

    public int getUnseen() {
        return unseen;
    }

    public ArrayList<Matrix> getMatrix() {
        return matrix;
    }

    public int getMatrixLength() {
        return matrixLength;
    }

    public ArrayList<SubjectFQ> getSubjects() {
        return subjects;
    }

    public Meta getMeta() {
        return meta;
    }
}

