package com.kodilla.good.patterns.challenges.Flight;

import java.util.Set;
import java.util.stream.Collectors;

public class DeparatureSearch implements TheFlightRepository {

    private String deparature;

    public DeparatureSearch(String deparature) {
        this.deparature = deparature;
    }

    public void searchAflight(){

        Set<TheFlight> flightsWithDeparture = (new FlightDate()).getTheFlightList().stream()
                .filter(f -> f.getDeparatureOfAirport().equals(deparature))
                .collect(Collectors.toSet());

        if(flightsWithDeparture.size()==0) {

            System.out.println("No flights with this deparature");

        }else {

            System.out.println("Please find your flight");
            flightsWithDeparture.stream()
                    .map(f->f.getDeparatureOfAirport() + f.getArrivalOfAirport())
                    .forEach(System.out::println);
        }



    }
}
