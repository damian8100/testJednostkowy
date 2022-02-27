package com.kodilla.good.patterns.challenges.Flight;

public class App {

    public static void main(String[] args) {

        DeparatureSearch deparatureSearch = new DeparatureSearch("Katowice");
        deparatureSearch.searchAflight();
        System.out.println();
        ArrivalSearch arrivalSearch = new ArrivalSearch("Gdańsk");
        arrivalSearch.searchAflight();

        TheFlightProcessor theFlightProcessor = new TheFlightProcessor(new FlightDate());
        System.out.println(theFlightProcessor.flightsFrom("Warszawa"));
        System.out.println(theFlightProcessor.flightsTo("Katowice"));
        System.out.println(theFlightProcessor.indirectFlights("Katowice", "Gdańsk"));


    }
}
