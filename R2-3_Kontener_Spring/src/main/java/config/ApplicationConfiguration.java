package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.ITaskService;
import service.TaskService;

/**
 * Author: Daniel
 */
@Configuration
public class ApplicationConfiguration {

    @Bean (name = {"myService", "aliasService"} )
    public ITaskService taskService() {
        return new TaskService();
    }
}
