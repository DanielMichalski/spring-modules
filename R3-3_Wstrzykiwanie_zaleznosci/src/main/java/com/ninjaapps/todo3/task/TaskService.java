package com.ninjaapps.todo3.task;

import com.ninjaapps.todo3.model.Task;
import com.ninjaapps.todo3.service.IToDoListStrategy;
import com.ninjaapps.todo3.service.ToDoListQualifier;
import com.ninjaapps.todo3.service.ToDoListType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: Daniel
 */
@Service
public class TaskService implements ITaskService {
    @Autowired
    @ToDoListQualifier(strategy = ToDoListType.EISENHOWER)
    private IToDoListStrategy toDoListChooser;

    @Value("${taskService.id}")
    private int serviceId;

    @Resource
    private ApplicationContext context;

    @Override
    public int getServiceId() {
        return serviceId;
    }

    public List<Task> findCurrentToDoList() {
        toDoListChooser = (IToDoListStrategy) context.getBean("eisenhowerToDoListStrategy");
        return toDoListChooser.crateTodoList();
    }
}
