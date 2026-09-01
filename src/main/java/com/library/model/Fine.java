package com.library.model;

public class Fine {

    private int fineId;
    private int loanId;
    private double amount;
    private String reason;
    private String fineDate;
    private boolean paid;

    //Constructor
    public Fine() {

    }

    //Getter
    public int getFineId() {
        return fineId;
    }

    public int getLoanId() {
        return loanId;
    }

    public double getAmount() {
        return amount;
    }

    public String getReason() {
        return reason;
    }

    public String getFineDate() {
        return fineDate;
    }

    public boolean isPaid() {
        return paid;
    }

    //Setter
    public void setFineId(int fineId) {
        this.fineId = fineId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setFineDate(String fineDate) {
        this.fineDate = fineDate;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
