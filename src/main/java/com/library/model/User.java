package com.library.model;

public class User {

    private String userID;
    private String userName;
    private String password;  //convert hash and save DB[pom fill update to hash now not u update after]
    private String fullName;
    private String jobRole;
    private String status;

    public User() {

    }

    // Getter

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobRole() {
        return jobRole;
    }

    public String getStatus() {
        return status;
    }

    // Setter

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
