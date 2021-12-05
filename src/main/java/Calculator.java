package com.kodilla;

public class Calculator {

    private int a = 16;
    private int b = 15;

    public Calculator(){
        this.a=a;
        this.b=b;
    }

    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public void sumPlus(){
        int plusResult = a + b;
        System.out.println("Wynik dodawania to: " + plusResult);
    }
    public void sumMinus(){
        int minusResult = a -  b;
        System.out.println("Wynik odejmowania to: " + minusResult);
    }

    public static void main (String args[]){

        Calculator calculator = new Calculator();
        calculator.sumPlus() ;
        calculator.sumMinus() ;
    }
}
