package com.kodilla.exception.io.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();



        try{
            System.out.println("Result " + firstChallenge.divide(3,0));
        } catch (ArithmeticException e) {
            System.out.println("Oh no! Dzieliłeś przez zero?? " + e);
        } finally {
            System.out.println("I am gonna be here... always!");
        }



    }
}