import model.Task;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TaskService;

import java.util.Date;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("contex.xml");

        TaskService taskService = context.getBean(TaskService.class);
        taskService.addTask("Nowe zadanie", new Date(), new Date());
    }
}
