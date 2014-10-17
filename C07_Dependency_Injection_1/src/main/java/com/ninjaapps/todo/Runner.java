package com.ninjaapps.todo;

import com.ninjaapps.todo.model.Task;
import com.ninjaapps.todo.service.TaskService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        TaskService taskService = context.getBean(TaskService.class);
        List<Task> currentToDoList = taskService.findCurrentToDoList();

        System.out.println(currentToDoList);
    }
}
