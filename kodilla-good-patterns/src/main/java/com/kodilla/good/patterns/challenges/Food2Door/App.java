package com.kodilla.good.patterns.challenges.Food2Door;

public class App {

    public static void main(String[] args) {

        FoodRetriver foodRetriver = new FoodRetriver();
        foodRetriver.retrieve();

       FoodProcessor foodProcessor = new FoodProcessor(new FoodProducent(), new CreateFoodOrdersToSend(), new SendingEmail());



        foodRetriver.retrieve().stream()
                .forEach(foodProcessor::process);


    }
}
//
