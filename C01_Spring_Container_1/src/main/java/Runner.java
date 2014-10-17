import com.ninjaapps.todo2.config.ApplicatinConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ninjaapps.todo2.service.ITaskService;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
//        xmlConfig();
        classConfig();
    }

    private static void xmlConfig() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        ITaskService bean = (ITaskService) context.getBean("myService");
        System.out.println(bean.getServiceId());
    }

    private static void classConfig() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicatinConfig.class);

        ITaskService bean = (ITaskService) context.getBean("myService");
        System.out.println(bean.getServiceId());
    }
}
