package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements  Task {

    String taskName;
    String whatToBuy;
    double quantity;
    boolean isExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }
    public void executeTask(){

        isExecuted=true;

        System.out.println("The Task is in progress...");
    }
    public boolean isTaskExecuted(){

        return isExecuted;
    }

}
