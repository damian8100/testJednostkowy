package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverStudent{

    public final String mentorName;
    private  int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void sendAndUpdateTask(HomeworkTask homeworkTask) {
        System.out.println(mentorName + "Task3 " + homeworkTask.getTaskName() + "\n" + "total " + homeworkTask.getTasks().size() + " Tasks");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
