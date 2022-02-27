package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
            @Qualifier(value = "taskToDoList")
            @Lazy
    TaskList toDo;

    @Autowired
    @Qualifier(value = "taskInProgressList")
    @Lazy
    TaskList inProgress;

    @Autowired
    @Qualifier(value = "taskDoneList")
    @Lazy
    TaskList done;

    @Bean
    public Board getBoard() {
        return new Board(toDo, inProgress, done);
    }


    @Bean(name = "taskToDoList")
    @Scope("prototype")
    public TaskList getTaskToDoList() {
        return new TaskList();
    }

    @Bean(name = "taskInProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "taskDoneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }
}

