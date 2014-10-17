package com.ninjaapps.todo.service;

import com.ninjaapps.todo.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Daniel
 */
@Service
public class ToDoListChooserStrategy {
    public List<Task> crateTodoList() {
        return new ArrayList<Task>();
    }
}
