package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("ShoppingList","Egg",3.0);
            case PAINTINGTASK:
                return new PaintingTask("PaintingList","Blue","Glass");
            case DRIVINGTASK:
                return new DrivingTask("DrivingList", "Home", "A car");
            default:
                return null;
        }

    }
}



