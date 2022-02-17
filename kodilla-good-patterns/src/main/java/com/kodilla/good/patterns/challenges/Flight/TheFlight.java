package com.kodilla.good.patterns.challenges.Flight;

import java.util.Objects;

public class TheFlight {

    private String deparatureOfAirport;
    private String arrivalOfAirport;

    public TheFlight(String deparatureOfAirport, String arrivalOfAirport) {
        this.deparatureOfAirport = deparatureOfAirport;
        this.arrivalOfAirport = arrivalOfAirport;
    }

    public String getDeparatureOfAirport() {
        return deparatureOfAirport;
    }

    public String getArrivalOfAirport() {
        return arrivalOfAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TheFlight theFlight = (TheFlight) o;
        return Objects.equals(deparatureOfAirport, theFlight.deparatureOfAirport) && Objects.equals(arrivalOfAirport, theFlight.arrivalOfAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deparatureOfAirport, arrivalOfAirport);
    }

    @Override
    public String toString() {
        return "TheFlight{" +
                "deparatureOfAirport='" + deparatureOfAirport + '\'' +
                ", arrivalOfAirport='" + arrivalOfAirport + '\'' +
                '}';
    }
}
