package com.kodilla.good.patterns.challenges.Food2Door;

public class CreateFoodOrdersToSend implements FoodOrderService {


    public boolean order(User user, FoodProduct foodProduct){

        if((user != null) && (foodProduct !=null)) {

            System.out.println("The new order is creating: "+ " " + foodProduct.getName()+" " + "for " + user.getUserName()+ " " + user.getUserSurname() + "; " + "Single price of product is: " + " " + foodProduct.getPrice() + "zł");
        }else{
            System.out.println("Invaild data!");
        }
        return true;
    }


    }

