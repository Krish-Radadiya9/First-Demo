package com.example.validation.Entity;

import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.*;

public class LoginData {

    @NotEmpty(message = "UserName Can not be empty!!")
    @Size(min = 3, max = 13, message = "UserName Must to be between 3-12 character!!")
    private String userName;
    @Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", message = "Invalid E-Mail!")
    //@Email(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")
    private String userEmail;
    @AssertTrue(message = "Must Agree Term and Conditions!!")
    private boolean agreed;

    public LoginData() { 
    }

    public LoginData(String userName, String userEmail, boolean agreed) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.agreed = agreed;
    }

    public LoginData(String userName, String userEmail) {
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", agreed=" + agreed +
                '}';
    }
}
