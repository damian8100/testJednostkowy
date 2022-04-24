package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaOrderDecorator implements  PizzaOrder {

    private final PizzaOrder pizzaOrder;

    public AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCostOfComponents() {
        return pizzaOrder.getCostOfComponents();
    }

    @Override
    public String getDescriptionOfComponents() {
        return pizzaOrder.getDescriptionOfComponents();
    }
}
