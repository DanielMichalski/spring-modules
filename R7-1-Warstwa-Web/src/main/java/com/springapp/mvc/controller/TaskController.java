package com.springapp.mvc.controller;

import com.springapp.mvc.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author: Daniel
 */
@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping (value = "/all-task", method = RequestMethod.GET)
    public String allTasks(ModelMap model) {
        model.addAttribute("allTasks", taskService.findAllTasks());
        return "all-tasks";
    }
}
