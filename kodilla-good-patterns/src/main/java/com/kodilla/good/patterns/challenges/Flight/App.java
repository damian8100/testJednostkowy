package com.kodilla.good.patterns.challenges.Flight;

public class App {

    public static void main(String[] args) {

        FlightDate flightDate = new FlightDate();

        flightDate.getTheFlightList().stream()
                .map(f->"Deparature: " + f.getDeparatureOfAirport()+ " " + "Arrival: " + f.getArrivalOfAirport())
                .forEach(System.out::println);

        System.out.println();



    }
}
