package com.ninjaapps.todo.service;

import com.ninjaapps.todo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author: Daniel
 */
@Component
public class TaskService implements ITaskService {
    @Autowired (required = true)
    private ToDoListChooserStrategy toDoListChooser;

    @Override
    public String getServiceId() {
        return "taskService#1";
    }

    public List<Task> findCurrentToDoList() {
        List<Task> tasks = toDoListChooser.crateTodoList();

        tasks.add(new Task(1L));
        tasks.add(new Task(2L));
        tasks.add(new Task(3L));

        return tasks;
    }
}
