package com.kodilla.exception.test;

import java.util.HashMap;

public class FindFlight {

 public void findFlight(Flight flight)throws RouteNotFoundException{

     HashMap<String, Boolean>theFlightList = new HashMap<>();
     theFlightList.put("Warszawa", true);
     theFlightList.put("Wrocław",true);
     theFlightList.put("Katowice",false);

     if(theFlightList.containsKey(flight.getDeparatureAirport())){
         throw new RouteNotFoundException("Lotnisko nie istnieje");
     }
     if(theFlightList.containsKey(flight.getArrivalAirport())){
         throw new RouteNotFoundException("Lotnisko nie istnieje");
     }

 }
}