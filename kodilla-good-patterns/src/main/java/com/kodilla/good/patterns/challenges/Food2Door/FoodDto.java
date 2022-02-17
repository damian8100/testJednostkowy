package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodDto {

    private User user;
    private boolean isFoodCreate;

    public FoodDto(User user, boolean isFoodCreate) {
        this.user = user;
        this.isFoodCreate = isFoodCreate;
    }

    public User getUser() {
        return user;
    }

    public boolean isFoodCreate() {
        return isFoodCreate;
    }
}
