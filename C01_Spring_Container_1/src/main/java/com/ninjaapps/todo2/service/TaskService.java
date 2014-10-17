package com.ninjaapps.todo2.service;

import org.springframework.stereotype.Component;

/**
 * Author: Daniel
 */
@Component ("myService")
public class TaskService implements ITaskService {
    @Override
    public String getServiceId() {
        return "taskService#1";
    }
}
