package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity()
    {
        //given
        World world = new World();
        List<Continent> continents = new ArrayList<>();
        List<Country> countries = new ArrayList<>();
       countries.add(new Country(new BigDecimal(36000000), "Poland"));
       countries.add(new Country(new BigDecimal(83160000), "Germany"));
       countries.add(new Country(new BigDecimal(10594000),"Chech Republic"));
       continents.add(new Continent("Europe",countries));
       world.addContinent(new Continent("Europe",countries));

       //when
        BigDecimal peopleQuantity = world.theWorldList.stream()
                .flatMap(continent -> continent.theCountryList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO,(sum,current)->sum.add(current));
        //then
        BigDecimal quantityOfPeople = new BigDecimal("129754000");
        Assertions.assertEquals(quantityOfPeople,peopleQuantity);

    }
}
