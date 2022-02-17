package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodProducent implements Producer {



    public void process(FoodOrder foodOrder) {


        System.out.println("The Order: " + foodOrder.getFoodProduct().getName()+" for " + foodOrder.getUser().getUserName() + " " + foodOrder.getUser().getUserSurname()+"; " + " Ammount of order: " + foodOrder.getHowMuchProduct()+"; "+ "Price all of products: " + foodOrder.getPrice()+"zł");

    }


}
