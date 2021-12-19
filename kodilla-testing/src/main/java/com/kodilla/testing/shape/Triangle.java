package com.kodilla.testing.shape;

public class Triangle implements Shape{
    @Override
    public void getShapeName(String name){
        System.out.println("Triangle");


    }

    double a;
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public void getField(){

        double sum = 0.5*(a*h);
        System.out.println("Field is"+ sum);


    }
}
