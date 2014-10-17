package com.ninjaapps.todo2.task;

import com.ninjaapps.todo2.model.Task;
import com.ninjaapps.todo2.service.IToDoListStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Daniel
 */
@Service
public class TaskService implements ITaskService {
    @Autowired(required = true)
    @Qualifier(value = "eisenhowerToDoListStrategy")
    private IToDoListStrategy toDoListChooser;

    @Override
    public String getServiceId() {
        return "taskService#1";
    }

    public List<Task> findCurrentToDoList() {
        return toDoListChooser.crateTodoList();
    }
}
