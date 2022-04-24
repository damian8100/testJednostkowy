package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {

    @Override
    public BigDecimal getCostOfComponents() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescriptionOfComponents() {
        return "Pizza with cheese and tomato sose";
    }
}
