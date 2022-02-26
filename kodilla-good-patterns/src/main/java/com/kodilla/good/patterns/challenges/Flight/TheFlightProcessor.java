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

        Set<TheFlight>flightWithDeparature = (new FlightDate()).getTheFlightList().stream()
                .filter(f->f.getDeparatureOfAirport().equals(city))
                .collect(Collectors.toSet());


        return new HashSet<>(flightWithDeparature);
    }

    public Set<TheFlight> flightsTo(String city){

        Set<TheFlight>flightsWithArrival = (new FlightDate()).getTheFlightList().stream()
                .filter((b->b.getArrivalOfAirport().equals(city)))
                .collect(Collectors.toSet());

        return new HashSet<>(flightsWithArrival);
    }

    public Set<TheFlight> indirectFlights(String start, String end){
        Set<TheFlight>fromCity = flightsFrom(start);
        Set<TheFlight>toCity = flightsTo(end);

        for(TheFlight theFlight:flightDate.getTheFlightList()){

            Set<TheFlight>flightwith = flightDate.getTheFlightList().stream()
                    .filter(f->f.getDeparatureOfAirport().equals(theFlight.getArrivalOfAirport())&&!(f.getArrivalOfAirport().equals(theFlight.getDeparatureOfAirport())))
                    .map(f->new TheFlight(theFlight.getDeparatureOfAirport(), f.getArrivalOfAirport()))
                    .collect(Collectors.toSet());
        }




       // for(int i = 0; i<fromCity.size(); i++) {
       //     for( int j =0; i<toCity.size(); j++) {

        //      }
       //     }




        return new HashSet<>();
    }
}
