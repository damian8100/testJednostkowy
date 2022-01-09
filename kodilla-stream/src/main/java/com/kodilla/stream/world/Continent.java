package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private String continentName;
    private List<Country>countryList = new ArrayList<>();

    public Continent(String continentName, List<Country> countryList)
    {
        this.continentName = continentName;
        this.countryList = countryList;
    }

    public  final List<Country>theCountryList()
    {
        return countryList;
    }

    public void addCountry(Country country)
    {
        countryList.add(country);
    }                                   //gdy chcę cośtylko dodać do listy zawsze typ void

}
