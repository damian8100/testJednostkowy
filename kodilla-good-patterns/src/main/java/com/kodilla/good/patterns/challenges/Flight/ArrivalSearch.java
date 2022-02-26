package com.kodilla.good.patterns.challenges.Flight;

import java.util.Set;
import java.util.stream.Collectors;

public class ArrivalSearch {

    private String arival;

    public ArrivalSearch(String arrival) {

        this.arival = arrival;
    }

    public void searchAflight(){

        Set<TheFlight> flightsWithArrival = (new FlightDate()).getTheFlightList().stream()
                .filter(f -> f.getArrivalOfAirport().equals(arival))
                .collect(Collectors.toSet());

        if(flightsWithArrival.size()==0) {

            System.out.println("No flights to this arrival" + arival);

        }else {

            System.out.println("Please find your flight");
            System.out.println("Wait..");
            System.out.println("Connections to destination city You choose:");
            flightsWithArrival.stream()
                    .map(f->f.getDeparatureOfAirport() + " " + f.getArrivalOfAirport())
                    .forEach(System.out::println);
        }



    }



}


