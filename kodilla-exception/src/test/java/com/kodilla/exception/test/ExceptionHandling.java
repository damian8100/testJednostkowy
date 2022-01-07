package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = secondChallenge.probablyIWillThrowException(1.5,2);

        try{secondChallenge.probablyIWillThrowException(1.5,2);

        }catch (Exception e){
            System.out.println("Problem while reading a file");
        }finally {
            System.out.println("Always here");
        }

    }}
