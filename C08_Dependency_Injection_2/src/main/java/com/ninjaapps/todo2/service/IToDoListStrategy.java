package com.ninjaapps.todo2.service;

import com.ninjaapps.todo2.model.Task;

import java.util.List;

/**
 * Author: Daniel
 */
public interface IToDoListStrategy {
    List<Task> crateTodoList();
}
