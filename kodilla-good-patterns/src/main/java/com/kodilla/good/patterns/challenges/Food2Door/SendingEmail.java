package com.kodilla.good.patterns.challenges.Food2Door;


public class SendingEmail implements InformService {

    public boolean sendMessage(User user) {

        System.out.println("Sending an email witch information to " + user.getUserName() + " "+ user.getUserSurname());

        return true;
    }

}
