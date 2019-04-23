package com.qy.entity;

public class WorkStaffWithBLOBs extends WorkStaff {
    private String reportNote;

    private String review;

    public String getReportNote() {
        return reportNote;
    }

    public void setReportNote(String reportNote) {
        this.reportNote = reportNote == null ? null : reportNote.trim();
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review == null ? null : review.trim();
    }
}