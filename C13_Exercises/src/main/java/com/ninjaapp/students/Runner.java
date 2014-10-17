package com.ninjaapp.students;

import com.ninjaapp.students.service.StudentsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: Daniel
 */
public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        StudentsService studentsService =
                context.getBean(StudentsService.class);

        System.out.println("Kowalski is student? " +
                studentsService.isStudent("Kowalski"));

        System.out.println("Smith is student? " +
                studentsService.isStudent("Smith"));
    }
}
