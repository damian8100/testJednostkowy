package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@DisplayName("TDD: Shape Test Suite")

public class ShapeCollectorTestSuite {

    static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

    }

    @Test
    void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(4);
        shapeCollector.addFigure(circle);

        //When
        List<Shape> result = shapeCollector.getCollectionShapeList();

        //Then
        Assertions.assertEquals(1, result.size());
    }


    @DisplayName("Test removeFigure")

    @Test
    void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(4);
        Square square = new Square(4);
        Triangle triangle = new Triangle(2, 3);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.removeFigure(new Circle(4));


        //When
        List<Shape> result = shapeCollector.getCollectionShapeList();

        //Then
        Assertions.assertEquals(2, result.size());
    }


    @Test
    void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(4);
        Square square = new Square(4);
        Triangle triangle = new Triangle(2, 3);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assertions.assertNotNull(result);

    }
}


