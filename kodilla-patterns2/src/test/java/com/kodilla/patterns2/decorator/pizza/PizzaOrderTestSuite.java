package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //when
        BigDecimal calculatedCost = theOrder.getCostOfComponents();
        //then
        assertEquals(new BigDecimal(15.00), calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //when
        String description = theOrder.getDescriptionOfComponents();
        //then
        assertEquals("Pizza with cheese and tomato sose",description );
    }
    @Test
    public void testRichPizzaOrderGetDescription() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheesePizzaDecorator(theOrder);
        theOrder = new HamPizzaOrderDecorator(theOrder);
        theOrder = new MushroomsPizzaDecorator(theOrder);
        theOrder = new ChickenPizzaDecorator(theOrder);
        System.out.println(theOrder.getDescriptionOfComponents());

        //when
        String description = theOrder.getDescriptionOfComponents();
        //then
        assertEquals("Pizza with cheese and tomato sose + cheese + ham + mushrooms + chicken",description );
    }
}
