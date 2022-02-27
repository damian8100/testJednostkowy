package com.kodilla.good.patterns.challenges.Flight;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TheFlightProcessor {

    private FlightDate flightDate;

    public TheFlightProcessor(FlightDate flightDate) {
        this.flightDate = flightDate;
    }


    public Set<TheFlight> flightsFrom(String city){

        Set<TheFlight>flightWithDeparature = flightDate.getTheFlightList().stream()
                .filter(f->f.getDeparatureOfAirport().equals(city))
                .collect(Collectors.toSet());


        return new HashSet<>(flightWithDeparature);
    }

    public Set<TheFlight> flightsTo(String city){

        Set<TheFlight>flightsWithArrival = flightDate.getTheFlightList().stream()
                .filter((b->b.getArrivalOfAirport().equals(city)))
                .collect(Collectors.toSet());

        return new HashSet<>(flightsWithArrival);
    }

    public Set<TheFlight> indirectFlights(String start, String end){
        Set<TheFlight>fromCity = flightsFrom(start);
        Set<TheFlight>toCity = flightsTo(end);


        Set<TheFlight>results = new HashSet<>();

        for(TheFlight first : fromCity){

            for(TheFlight last : toCity){

                if (first.getArrivalOfAirport().equals(last.getDeparatureOfAirport())){

                    results.add(first);
                    results.add(last);

                }
            }
        }

        return new HashSet<>(results);
    }
}
