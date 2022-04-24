package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CheesePizzaDecorator extends AbstractPizzaOrderDecorator {
    public CheesePizzaDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCostOfComponents() {
        return super.getCostOfComponents().add(new BigDecimal(5));
    }

    @Override
    public String getDescriptionOfComponents() {
        return super.getDescriptionOfComponents() + " + cheese";
    }
}
