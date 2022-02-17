package com.kodilla.good.patterns.challenges.OrderService;

public class EmailService implements InformationService {


    public boolean sendMessage(User user) {

        System.out.println("Sending an email to " + user.getUserEmail());

    return true;
    }

}
