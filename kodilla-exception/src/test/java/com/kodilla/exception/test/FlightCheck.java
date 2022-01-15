package com.kodilla.exception.test;

public class FlightCheck {

    public static void main (String[] args){

        FindFlight findFlight=new FindFlight();

        try{
            findFlight.findFlight(new Flight("Katowice", "Wrocław"));
        }catch (RouteNotFoundException e) {
            System.out.println("Błąd" + e.getMessage());
        }finally {
            System.out.println("Jakis tekst");
        }
    }
}
