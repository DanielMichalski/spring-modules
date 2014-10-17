import library.Library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        Library library = context.getBean(Library.class);
        library.registerNemUser("Smith");
        System.out.println("library opening hours: " + library.getOpeningHours());
    }
}
