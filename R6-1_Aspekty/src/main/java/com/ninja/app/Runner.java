package com.ninja.app;

import com.ninja.app.service.TaskService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        TaskService taskService = context.getBean(TaskService.class);
        taskService.addTask("Zadanie 1");
    }
}
