package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userID;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDate;
    private final int numbersOfPost;

    public ForumUser(int userID, String userName, char userSex, int yearOfBirth,int monthOfBirth, int dayOfBirth, int numbersOfPost) {
        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.numbersOfPost = numbersOfPost;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumbersOfPost() {
        return numbersOfPost;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", numbersOfPost=" + numbersOfPost +
                '}';
    }
}
