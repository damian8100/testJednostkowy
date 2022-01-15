package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite implements ArrayOperations
{
    @Test
    void testGetAverage()
    {
        //given
         ArrayOperations.getAverage(new int[20]);
         //then
        Assertions.assertEquals(9.5,ArrayOperations.getAverage(new int[20]));

    }
}
