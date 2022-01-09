package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

     private BigDecimal peopleQuantity;
     private String countryName;

    public Country(BigDecimal peopleQuantity, String countryName)
    {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    public BigDecimal getPeopleQuantity()
    {
        return peopleQuantity;
    }
}
