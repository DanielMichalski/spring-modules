package com.ninja.app;

import com.ninja.app.model.Task;
import com.ninja.app.service.TaskService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        TaskService taskService =
                context.getBean(TaskService.class);


        Task task = new Task(1, "Zadanie1", new Date(), new Date());

        taskService.addTask(task);
    }
}
