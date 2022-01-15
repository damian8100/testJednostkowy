package com.kodilla.exception.test;

public class Flight
{
    private String deparatureAirport;
    private String arrivalAirport;

    public Flight(String deparatureAirport, String arrivalAirport) {
        this.deparatureAirport = deparatureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDeparatureAirport() {
        return deparatureAirport;
    }

    public String getArrivalAirport() {

        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "deparatureAirport='" + deparatureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }
}
