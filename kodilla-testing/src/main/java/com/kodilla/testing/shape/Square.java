package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    @Override
    public void getShapeName(String name){

        System.out.println("Square");
    }

    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    @Override
    public void getField() {
        double sum;
        sum = a*a;

        System.out.println("Field is" + sum);
    }
}