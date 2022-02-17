package com.kodilla.good.patterns.challenges.OrderService;

public class App {

    public static void main(String[] args) {

        OrderRetriver orderRetriver = new OrderRetriver();

        OrderProcessor orderProcessor = new OrderProcessor(new EmailService(),new OrderRealize(), new OrderDateBase());

        orderRetriver.retrieve().stream()
                .forEach(orderProcessor::process);

        System.out.println("List of datbase: ");
        orderProcessor.getOrderRepository().showOrderDateBase();
    }
}
