package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements  Task {

    String taskName;
    String where;
    String using;
    boolean isExecuted;
    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
    public void executeTask(){

        isExecuted=true;

        System.out.println("The Task is in progress...");
    }
    public boolean isTaskExecuted(){

        return isExecuted;
    }
}
