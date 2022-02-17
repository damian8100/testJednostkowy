package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderDateBase implements OrderRepository {

    List<String>orderData =new ArrayList<>();

    @Override
    public boolean createOrder(User user, Product product, LocalDate orderDate) {

        orderData.add("New order created with date" + "" +orderDate + "for" + user.getUserName() + " " + user.getUserSurname()+ " " + product.getProductPrice() );


        return true;
    }

    @Override
    public void showOrderDateBase() {

        System.out.println("the list: "+ orderData.size());

    }
}
