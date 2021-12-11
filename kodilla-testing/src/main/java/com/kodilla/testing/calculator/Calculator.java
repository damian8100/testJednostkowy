package com.kodilla.testing.calculator;

public class Calculator {

    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {

        return this.a;
    }

    public int getB() {

        return this.b;
    }

    public int sumAdd(){
        System.out.println("Wynik dodawania to: "+ (this.a+this.b));
        return this.a + this.b;
    }
    public int substratct(){
        System.out.println("Wynik odejmowania to: "+ (this.a-this.b));
        return this.a - this.b;
    }
}

