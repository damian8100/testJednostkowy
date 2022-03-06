package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingList = factory.makeTask(TaskFactory.SHOPPINGTASK);


        //Then

        assertEquals("ShoppingList", shoppingList.getTaskName());

    }
    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingList = factory.makeTask(TaskFactory.DRIVINGTASK);



        //Then

        assertEquals("DrivingList", drivingList.getTaskName());

    }
    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingList = factory.makeTask(TaskFactory.PAINTINGTASK);


        //Then

        assertEquals("PaintingList", paintingList.getTaskName());

    }

}
