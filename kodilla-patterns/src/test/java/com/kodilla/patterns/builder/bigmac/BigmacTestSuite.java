package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigMacNew() {

        //given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .ingredient("Onion")
                .bun("Sezam")
                .sauce("1000 island")
                .burgers(3)
                .ingredient("paprik chilli")
                .ingredient("mushrooms")
                .build();
        System.out.println(bigmac);

        //when

        int howManyIngredients = bigmac.getIngredients().size();

        //then

        assertEquals(3, howManyIngredients);




    }}
