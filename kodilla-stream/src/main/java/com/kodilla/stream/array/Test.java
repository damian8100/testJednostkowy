package com.kodilla.stream.array;

import java.util.stream.IntStream;

public class Test {

    public static void main (String[] args){
        int size =20;
        int [] numbers = new int [size];

        IntStream.range(0,20)
                .limit(size)
                .forEach(System.out::println);


        Double aver = IntStream.range(0,20)
                        .limit(size)
                        .average()
                        .getAsDouble();
        System.out.println("The average is: " + aver);






    }
}