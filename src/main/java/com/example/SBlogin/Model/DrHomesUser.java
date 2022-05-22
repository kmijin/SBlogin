package com.example.SBlogin.Model;

import java.util.Date;


public class DrHomesUser {
    private String userId;
    private String userPassword;
    private String userName;
    private String userBirth;
    private String userGender;
    private int emailAgree;
    private String joinDate;

    public DrHomesUser() {
    }

    public DrHomesUser(String userId, String userPassword, String userName, String userBirth, String userGender, int emailAgree, String joinDate) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userBirth = userBirth;
        this.userGender = userGender;
        this.emailAgree = emailAgree;
        this.joinDate = joinDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public int getEmailAgree() {
        return emailAgree;
    }

    public void setEmailAgree(int emailAgree) {
        this.emailAgree = emailAgree;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
}
