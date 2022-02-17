package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop {

    private String name;
    private String adress;
    private Producer producer;

    public ExtraFoodShop(String name, String adress, Producer producer) {
        this.name = name;
        this.adress = adress;
        this.producer = producer;
    }

    public String getName() {

        return name;
    }

    public String getAdress() {

        return adress;
    }

    public Producer getProducer() {
        return producer;
    }

    public void process(FoodOrder foodOrder) {

       System.out.println("Zamówienie" + foodOrder.getFoodProduct()+" "+ "w ilości: " + foodOrder.getHowMuchProduct() + "jest przygotowane");
    }


}
