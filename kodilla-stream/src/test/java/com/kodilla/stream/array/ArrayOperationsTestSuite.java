package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite
{
    @Test
    void testGetAverage()
    {
        //given

        int size []= new int[]{1,1,1,1};





         Assertions.assertEquals(1,ArrayOperations.getAverage(size),0.01);

    }
}
