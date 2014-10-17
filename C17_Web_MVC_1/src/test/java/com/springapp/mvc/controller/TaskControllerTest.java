package com.springapp.mvc.controller;

import com.springapp.mvc.model.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;

import java.util.List;

/**
 * Author: Daniel
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"file:C17_Web_MVC_1/src/main/webapp/WEB-INF/context.xml",
        "file:C17_Web_MVC_1/src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml"} )
public class TaskControllerTest {

    @Autowired
    TaskController controller;

    @Test
    public void souldReturnTaskListAndTaskFormCommand() throws Exception {
        MockHttpServletRequest req =
                new MockHttpServletRequest("GET", "/all-task");

        AnnotationMethodHandlerAdapter adapter =
                new AnnotationMethodHandlerAdapter();

        ModelAndView modelAndView =
                adapter.handle(req, new MockHttpServletResponse(), controller);

        ModelAndViewAssert.assertAndReturnModelAttributeOfType(modelAndView, "allTasks", List.class);
        ModelAndViewAssert.assertAndReturnModelAttributeOfType(modelAndView, "task", Task.class);
    }
}
