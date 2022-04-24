package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeworkTaskTestSuite {

    @Test
    public void testHomeworkTask(){

        HomeworkTask taskOne = new TaskOne();
        HomeworkTask taskTwo = new TaskTwo();
        Mentor mentor1 = new Mentor("Mentor 1 ");
        Mentor mentor2 = new Mentor("Mentor 2 ");
        taskOne.passTheStudentTask(mentor1);
        taskTwo.removeTheStudentTask(mentor1);
        taskTwo.passTheStudentTask(mentor2);
        taskOne.addTask("Mentor send You a new Task: Task 1");
        taskOne.addTask("Task 1");
        taskTwo.addTask("Task 2");

        Assertions.assertEquals(2,mentor1.getUpdateCount());
        Assertions.assertEquals(1,mentor2.getUpdateCount());
    }
}
