package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTask implements ObservableMentor {

    private final List<ObserverStudent> observersStudentsList;
    private final List<String>tasks;
    private final String taskName;

   public HomeworkTask(String taskName) {
       observersStudentsList = new ArrayList<>();
       tasks = new ArrayList<>();
       this.taskName = taskName;
   }
   public void addTask(String task){
       tasks.add(task);
       notifyTheStudentTask();
   }

    public List<String> getTasks() {
        return tasks;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public void passTheStudentTask(ObserverStudent observerStudent) {
       observersStudentsList.add(observerStudent);
    }

    @Override
    public void removeTheStudentTask(ObserverStudent observerStudent) {
       observersStudentsList.remove(observerStudent);

    }

    @Override
    public void notifyTheStudentTask() {
       for(ObserverStudent observerStudent : observersStudentsList) {
           observerStudent.sendAndUpdateTask(this); ;
       }

    }
}
