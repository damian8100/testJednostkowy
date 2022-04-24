package com.kodilla.patterns2.observer.homework;

public interface ObservableMentor {
    void passTheStudentTask(ObserverStudent observerStudent);
    void removeTheStudentTask(ObserverStudent observerStudent);
    void notifyTheStudentTask();
}
