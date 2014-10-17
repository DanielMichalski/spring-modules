package com.ninjaapps.todo2.service;

import javax.inject.Named;

/**
 * Author: Daniel
 */
@Named ("serwis")
public class TaskService implements ITaskService {
    @Override
    public String getServiceId() {
        return "taskService#1";
    }
}
