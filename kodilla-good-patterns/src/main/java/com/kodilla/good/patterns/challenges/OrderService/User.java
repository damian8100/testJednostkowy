package com.kodilla.good.patterns.challenges.OrderService;

public class User {

    private String UserName;
    private String UserSurname;
    private String userEmail;

    public User(String userName, String userSurname, String userEmail) {
        UserName = userName;
        UserSurname = userSurname;
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserSurname() {
        return UserSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
