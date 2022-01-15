package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    List<Continent> theWorldList = new ArrayList<>();

    public void addContinent(Continent continent)
    {                                               //przyjmuje obiekt typu Continent o nazwie continent
     theWorldList.add(continent);
    }

    public  final BigDecimal getPeopleQuantity ()
    {

        theWorldList.stream()
                .flatMap(continent -> continent.theCountryList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO,(sum,current)->sum.add(current));

                return theWorldList.stream()
                        .flatMap(continent -> continent.theCountryList().stream())
                        .map(country -> country.getPeopleQuantity())
                        .reduce(BigDecimal.ZERO,(sum,current)->sum.add(current));

    }
}
