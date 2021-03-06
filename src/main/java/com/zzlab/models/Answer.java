package com.zzlab.models;

import java.time.ZonedDateTime;

/**
 * 解答
 */
public class Answer {
    private long id;
    private long problemId;
    private String studentId; // 学籍番号
    private String answerDirPath;
    private ZonedDateTime submitDate; // 提出日

    private long markerId;
    private int point;
    private String markerComments;
    private ZonedDateTime markDate; // 採点日

    public Answer(long id, long problemId, String studentId, String answerDirPath, ZonedDateTime submitDate,
                  long markerId, int point, String markerComments, ZonedDateTime markDate) {
        this.id = id;
        this.problemId = problemId;
        this.studentId = studentId;
        this.answerDirPath = answerDirPath;
        this.submitDate = submitDate;
        this.markerId = markerId;
        this.point = point;
        this.markerComments = markerComments;
        this.markDate = markDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProblemId() {
        return problemId;
    }

    public void setProblemId(long problemId) {
        this.problemId = problemId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAnswerDirPath() {
        return answerDirPath;
    }

    public void setAnswerDirPath(String answerDirPath) {
        this.answerDirPath = answerDirPath;
    }

    public ZonedDateTime getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(ZonedDateTime submitDate) {
        this.submitDate = submitDate;
    }

    public long getMarkerId() {
        return markerId;
    }

    public void setMarkerId(long markerId) {
        this.markerId = markerId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getMarkerComments() {
        return markerComments;
    }

    public void setMarkerComments(String markerComments) {
        this.markerComments = markerComments;
    }

    public ZonedDateTime getMarkDate() {
        return markDate;
    }

    public void setMarkDate(ZonedDateTime markDate) {
        this.markDate = markDate;
    }
}
