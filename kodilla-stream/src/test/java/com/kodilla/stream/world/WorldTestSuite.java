package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity()
    {
        //given
        World world = new World();
        Continent continent = new Continent("Europe");
        Country countries = new Country(new BigDecimal(36000000),"Poland");
        Country countries1 = new Country(new BigDecimal(86000000),"Germany");
        Country countries2 = new Country(new BigDecimal(10000000),"Czech Republic");
        continent.addCountry(countries);
        continent.addCountry(countries1);
        continent.addCountry(countries2);
        world.addContinent(continent);

        //when
        //world.getPeopleQuantity();
        //then
        BigDecimal quantityOfPeople = new BigDecimal("132000000");
        Assertions.assertEquals(quantityOfPeople,world.getPeopleQuantity());

    }
}
