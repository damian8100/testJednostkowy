package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void ifIsLog() {
        logger = Logger.INSTANCE;
        logger.log("Użytkownik się zalogował");
    }



    @Test
    void testGetLastLog() {
        //Given
        //When
        String result = logger.getLastLog();
        //Then
        assertEquals("Użytkownik się zalogował", result);
    }

}

