package com.ninjaapps.todo2;

import com.ninjaapps.todo2.model.Task;
import com.ninjaapps.todo2.task.TaskService;
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
