package com.library.model;

public class Lone {

    private String loneID;
    private String memberID;
    private String bookID;
    private String issueDate;
    private String dueDate;
    private String returnDate;
    private String status;


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

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

}
