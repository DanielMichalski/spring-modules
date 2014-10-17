package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ninjaapps.todo2.service.ITaskService;
import com.ninjaapps.todo2.service.TaskService;

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
