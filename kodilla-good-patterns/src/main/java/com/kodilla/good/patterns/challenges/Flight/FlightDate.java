package com.kodilla.good.patterns.challenges.Flight;

import java.util.HashSet;
import java.util.Set;

public class FlightDate {

   private Set<TheFlight> theFlightList;

   public FlightDate() {

        theFlightList = new HashSet<>();

        theFlightList.add(new TheFlight("Warszawa", "Gdańsk"));
        theFlightList.add(new TheFlight("Kraków", "Warszawa"));
        theFlightList.add(new TheFlight("Katowice", "Wrocław"));
        theFlightList.add(new TheFlight("Wrocław","Poznań"));
        theFlightList.add(new TheFlight("Poznań","Katowice"));
        theFlightList.add(new TheFlight("Katowice", "Warszawa"));
        theFlightList.add(new TheFlight("Wrocław","Kraków"));
        theFlightList.add(new TheFlight("Poznań","Gdańsk"));

    }

    public Set<TheFlight>getTheFlightList(){

       return theFlightList;
    }
}
