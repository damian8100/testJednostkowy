package com.kodilla.exception.test;

import java.util.HashMap;

public class FindFlight {

 public void findFlight(Flight flight)throws RouteNotFoundException{


     HashMap<String, Boolean>theFlightList = new HashMap<>();
     theFlightList.put("Warszawa", true);
     theFlightList.put("Wrocław",true);
     theFlightList.put("Katowice",false);

     boolean cityExistsInMap = theFlightList.containsKey(flight.getDeparatureAirport());
     if(!cityExistsInMap){ // Wykrzyknik robi zaprzeczenie.
         throw new RouteNotFoundException("Lotnisko nie istnieje");
     }
    if(!theFlightList.get(flight.getDeparatureAirport())){// z list flightlist jesli istnieje a ma wartość false równiez wyrzucan7y jest wyjątek
        throw new RouteNotFoundException("Lotnisko nie istnieje");
    }

 }
}