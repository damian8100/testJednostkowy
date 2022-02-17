package com.kodilla.good.patterns.challenges.Food2Door;


import java.util.ArrayList;
import java.util.List;

public class FoodRetriver {

    public List<FoodOrder> retrieve() {



        List<FoodOrder>foodRequests = new ArrayList<>();

        FoodOrder foodOrder = new FoodOrder(new User("Jan","Kowalski"),new FoodProduct("Jajka",10.99),10);
        FoodOrder foodOrder1 = new FoodOrder(new User("Alan","Nowak"),new FoodProduct("Kiełbasa ",15.99),5);
        FoodOrder foodOrder2 = new FoodOrder(new User("Grażyna","Lewandowska"),new FoodProduct("Jabłka",2.99),7);

        foodRequests.add(foodOrder);
        foodRequests.add(foodOrder1);
        foodRequests.add(foodOrder2);

        return foodRequests;


    }
}
