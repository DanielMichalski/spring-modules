package com.springapp.mvc.controller;

import com.springapp.mvc.model.Task;
import com.springapp.mvc.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

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
        model.addAttribute("task", new Task());
        return "all-tasks";
    }

    @RequestMapping (value = "/all-task", method = RequestMethod.POST)
    public String saveTask(@Valid @ModelAttribute("task") Task task, BindingResult bindingResult, ModelMap modelMap) {
        if (bindingResult.hasErrors()) {
            return "all-tasks";
        }

        taskService.addTask(task);

        return "redirect:/all-task";
    }
}
