package com.springapp.mvc.service;

import com.springapp.mvc.model.Task;
import com.springapp.mvc.repository.dao.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author: Daniel
 */
@Component
public class TaskService {
    @Autowired
    @Qualifier("inMemoryRepository")
    private ITaskRepository repository;

    public void addTask(Task task) {
        repository.saveTask(task);
    }

    public List<Task> findAllTasks() {
        return repository.findAllTasks();
    }

}
