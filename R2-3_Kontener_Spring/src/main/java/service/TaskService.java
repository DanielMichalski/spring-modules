package service;

import org.springframework.stereotype.Component;

/**
 * Author: Daniel
 */
public class TaskService implements ITaskService {
    @Override
    public String getServiceId() {
        return "taskService#1";
    }
}
