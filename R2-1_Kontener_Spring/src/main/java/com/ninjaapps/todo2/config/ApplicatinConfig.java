package com.ninjaapps.todo2.config;

import com.ninjaapps.todo2.service.ITaskService;
import com.ninjaapps.todo2.service.TaskService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Daniel
 */
@Configuration
public class ApplicatinConfig {
    @Bean (name = { "myService", "taskService" })
    public ITaskService taskService() {
        return new TaskService();
    }
}
