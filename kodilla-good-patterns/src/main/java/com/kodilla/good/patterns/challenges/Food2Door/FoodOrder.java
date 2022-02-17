package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodOrder {

    private User user;
    private FoodProduct foodProduct;
    private int howMuchProduct;
    private double price;

    public FoodOrder(User user, FoodProduct foodProduct, int howMuchProduct) {
        this.user = user;
        this.foodProduct = foodProduct;
        this.price = foodProduct.getPrice()*howMuchProduct;
        this.howMuchProduct = howMuchProduct;
    }

    public User getUser() {

        return user;
    }

    public FoodProduct getFoodProduct() {

        return foodProduct;
    }

    public int getHowMuchProduct() {

        return howMuchProduct;
    }

    public double getPrice() {
        return price;
    }
}
