package com.ninja.app.service;

import com.ninja.app.dao.ITaskDao;
import com.ninja.app.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;

import java.util.List;
import java.util.Locale;

/**
 * Author: Daniel
 */
@Service
public class TaskService {
    @Autowired
    private ITaskDao taskDao;

    @Value("${taskService.serviceId}")
    private String serviceId;

    @Autowired
    private Validator validator;

    @Autowired
    private MessageSource messageSource;

    public void addTask(Task task) {
        Errors errors = new BindException(task, "task");
        validator.validate(task, errors);

        for (FieldError error : errors.getFieldErrors()) {
            String errorCode = formatErrorCode(error);

            String message = messageSource.getMessage(errorCode, null, new Locale("pl"));
            System.out.println(message);
        }

        taskDao.saveTask(task);
    }

    private String formatErrorCode(FieldError error) {
        return error.getCode() + "." + error.getObjectName() + "." + error.getField();
    }

    public String getServiceId() {
        return serviceId;
    }

    public List<Task> findCurrentToDoList() {
        return null;
    }
}
