import config.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.ninjaapps.todo2.service.ITaskService;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
       /* ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");*/
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        ITaskService bean = (ITaskService)
                context.getBean("myService");

        System.out.println(bean.getServiceId());
    }
}
