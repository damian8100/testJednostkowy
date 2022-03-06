package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    String taskName;
    String color;
    String whatToPaint;
    boolean isExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    public void executeTask(){

        isExecuted = true;

        System.out.println("The Task is in progress...");
    }
    public boolean isTaskExecuted(){

        return isExecuted;
    }
}
