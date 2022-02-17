package com.kodilla.good.patterns.challenges.OrderService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderRetriver {

    public List<OrderRequest>retrieve() {



        List<OrderRequest>orderRequests = new ArrayList<>();

        User user1 = new User("Jan", "Kowalski","jankowalski@gmail.com");
        User user2 = new User("Andrzej", "Nowak", "anowak@wp.pl");
        Product product1 = new Product("Narty ",250);
        Product product2 = new Product("Komputer ", 3500);
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.now();

        orderRequests.add(new OrderRequest(user1, product1, localDate1));
        orderRequests.add(new OrderRequest(user2,product2,localDate2));

        return orderRequests;

    }
}
