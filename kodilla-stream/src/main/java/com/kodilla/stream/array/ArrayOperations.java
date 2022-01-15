package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {



    static double getAverage(int[] numbers){

        IntStream.range(0,numbers.length)
                .limit(numbers.length)
                .forEach(System.out::println);


        Double aver = IntStream.range(0, numbers.length)
                .limit(numbers.length)
                .average()
                .getAsDouble();
        System.out.println("The average is: " + aver);

        return aver;

    }
}
