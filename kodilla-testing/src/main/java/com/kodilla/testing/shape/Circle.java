package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    @Override
    public void getShapeName(String name){

        System.out.println("Circle");
    }


    double r;
    double pi=3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0 && Double.compare(circle.pi, pi) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r, pi);
    }

    @Override
    public void getField(){
        double sum;
        sum = pi *r*r;
        System.out.println("Field is" + sum);


    }
}
