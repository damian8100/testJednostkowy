package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootConfiguration
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations(){

        //Given

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        calculator.add(1,3.5);
        calculator.sub(2,1);
        calculator.mull(2,2);
        calculator.div(4,4);

        //Then

        Assertions.assertEquals(calculator.add(1,3.5),4.5);
        Assertions.assertEquals(calculator.sub(2,1),1);
        Assertions.assertEquals(calculator.mull(2,2),4);
        Assertions.assertEquals(calculator.div(4,4),1);


    }
}
