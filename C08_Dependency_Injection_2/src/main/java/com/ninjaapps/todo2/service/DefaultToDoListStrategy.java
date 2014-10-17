package com.ninjaapps.todo2.service;

import com.ninjaapps.todo2.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
@Service
public class DefaultToDoListStrategy implements IToDoListStrategy {
    @Override
    public List<Task> crateTodoList() {
        List<Task> tasks = new ArrayList<Task>();

        tasks.add(new Task(1L));
        tasks.add(new Task(2L));
        tasks.add(new Task(3L));

        return tasks;
    }
}
