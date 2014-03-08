package com.springapp.mvc.repository.dao;

import com.springapp.mvc.model.Task;
import com.springapp.mvc.repository.RepositoryQualifer;
import com.springapp.mvc.repository.RepositoryType;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: Daniel
 */
@Repository
@RepositoryQualifer(repositoryType = RepositoryType.MEMORY)
public class InMemoryRepository implements ITaskRepository {
    private Map<Long, Task> storedTasks = new HashMap<Long, Task>();

    private Long nextId;

    @PostConstruct
    public void init() {
        nextId = 1L;
        saveTask(new Task("Zadanie 1"));
        saveTask(new Task("Zadanie 2"));
        saveTask(new Task("Zadanie 3"));
        saveTask(new Task("Zadanie 4"));
        saveTask(new Task("Zadanie 5"));
    }

    public void saveTask(Task task) {
        System.out.println("Dodano zadanie: " + task.getTaskName());
        storedTasks.put(nextId, task);
        nextId++;
    }

    @Override
    public List<Task> findAllTasks() {
        return new ArrayList<Task>( storedTasks.values() );
    }
}
