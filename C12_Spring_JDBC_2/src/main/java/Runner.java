import com.ninjaapp.students.model.Task;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ninja.app.service.TaskService;

import java.util.Date;
import java.util.List;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("contex.xml");

        TaskService taskService = context.getBean(TaskService.class);
        taskService.addTask("Nowe zadanie", new Date(), new Date());

        List<Task> allTasks = taskService.findAllTasks();
        for (Task task : allTasks) {
            System.out.println(task);
        }
    }
}
