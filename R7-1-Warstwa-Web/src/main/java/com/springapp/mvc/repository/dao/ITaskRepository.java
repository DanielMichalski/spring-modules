package com.springapp.mvc.repository.dao;

import com.springapp.mvc.model.Task;

import java.util.List;

/**
 * Author: Daniel
 */
public interface ITaskRepository {
    public void saveTask(Task task);

    public List<Task> findAllTasks();
}
