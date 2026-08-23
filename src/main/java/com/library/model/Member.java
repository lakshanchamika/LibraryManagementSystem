package com.library.model;

public class Member {

    private String memberID;
    private String memberName;
    private String email;
    private String phoneNumber;
    private String address;
    private String dateOfBirth;
    private String registrationDate;
    private boolean active;

    public Member() {

    }

    // Getter

    public String getMemberID() {
        return memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public boolean isActive() {
        return active;
    }

    // Setter


    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}
