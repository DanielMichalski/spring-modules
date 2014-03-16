package com.springapp.mvc.repository.dao;

import com.springapp.mvc.model.Task;
import com.springapp.mvc.repository.RepositoryQualifer;
import com.springapp.mvc.repository.RepositoryType;
import org.springframework.stereotype.Repository;

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

    private Long nextId = 0L;

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
