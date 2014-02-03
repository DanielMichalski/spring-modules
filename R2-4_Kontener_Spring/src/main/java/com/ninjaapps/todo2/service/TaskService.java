package com.ninjaapps.todo2.service;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Author: Daniel
 */
@Component
@Scope (BeanDefinition.SCOPE_PROTOTYPE)
public class TaskService implements ITaskService {
    @PostConstruct
    public void init() {
        System.out.println("Init...");
    }

    @Override
    public String getServiceId() {
        return "taskService#1";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying...");
    }
}
