package com.ninjaapps.todo3.service;

import com.ninjaapps.todo3.model.Task;

import java.util.List;

/**
 * Author: Daniel
 */
public interface IToDoListStrategy {
    List<Task> crateTodoList();
}
