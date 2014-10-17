package com.ninjaapps.todo3.service;

import com.ninjaapps.todo3.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
@Service
@ToDoListQualifier(strategy = ToDoListType.EISENHOWER)
public class EisenhowerToDoListStrategy implements IToDoListStrategy {
    @Override
    public List<Task> crateTodoList() {
        List<Task> tasks = new ArrayList<Task>();

        tasks.add(new Task(3L));
        tasks.add(new Task(2L));
        tasks.add(new Task(1L));

        return tasks;
    }
}
