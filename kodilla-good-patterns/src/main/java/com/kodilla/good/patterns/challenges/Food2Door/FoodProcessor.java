package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodProcessor {

    private Producer producer;
    private FoodOrderService foodOrderService;
    private InformService informService;


    public FoodProcessor(final Producer producer,
                         final FoodOrderService foodOrderService,
                         final InformService informService) {
        this.producer = producer;
        this.foodOrderService = foodOrderService;
        this.informService = informService;
    }
    public Producer getProducer(){

        return producer;
    }

    public FoodOrderService getFoodOrderService() {

        return foodOrderService;
    }

    public FoodDto process(final FoodOrder foodOrder){

        if(foodOrderService.order(foodOrder.getUser(),foodOrder.getFoodProduct())){

            producer.process(foodOrder);

            informService.sendMessage(foodOrder.getUser());

            return new FoodDto(foodOrder.getUser(), true);
        }
        return new FoodDto(foodOrder.getUser(), false);
    }
}
