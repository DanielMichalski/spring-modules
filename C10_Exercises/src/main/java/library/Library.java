package library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author: Daniel
 */
@Component
public class Library {

    @Autowired
    private StudentListService studentService;

    @Value("${openingHours}")
    private String openingHours;

    public void registerNemUser(String name) {
        if (!studentService.isStudent(name)) {
            throw new IllegalArgumentException(
                    "No such student [name=" + name + "]");
        }
    }

    public String getOpeningHours() {
        return openingHours;
    }
}
