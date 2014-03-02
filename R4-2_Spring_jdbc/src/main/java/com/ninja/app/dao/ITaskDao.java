package com.ninja.app.dao;

import com.ninjaapp.students.model.Task;

import java.util.List;

/**
 * Author: Daniel
 */
public interface ITaskDao {
    public void saveTask(Task task);

    public List findAllTasks();
}
