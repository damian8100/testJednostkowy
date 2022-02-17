package com.kodilla.good.patterns.challenges.OrderService;

public class OrderRealize implements  OrderService {

    @Override
    public boolean order(OrderRequest orderRequest) {

        if((orderRequest.getUser() != null) && (orderRequest.getProduct() !=null)) {

            System.out.println("The new order is creating: "+ " " + orderRequest.getProduct().getProductName() + "for"+ " " + orderRequest.getUser().getUserName() + orderRequest.getUser().getUserSurname() + orderRequest.getOrderDate());
        }else{
            System.out.println("Invaild data!");
        }
        return true;
    }
}
