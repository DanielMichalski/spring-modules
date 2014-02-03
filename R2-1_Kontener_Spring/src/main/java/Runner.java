import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ninjaapps.todo2.service.ITaskService;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        ITaskService bean = (ITaskService) context.getBean("myService");
        System.out.println(bean.getServiceId());
    }
}
