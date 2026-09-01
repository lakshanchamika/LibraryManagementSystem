package com.library.model;

public class Lone {

    private String loneID;
    private String memberID;
    private String bookID;
    private String issueDate;
    private String dueDate;
    private String returnDate;
    private String status;

    //Constructor
    public Lone() {

    }

    // Getter
    public String getLoneID() {
        return loneID;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getBookID() {
        return bookID;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public String getStatus() {
        return status;
    }

    // Setter
    public void setLoneID(String loneID) {
        this.loneID = loneID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
