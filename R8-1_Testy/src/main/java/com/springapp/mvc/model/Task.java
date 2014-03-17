package com.springapp.mvc.model;

import javax.validation.constraints.NotNull;

/**
 * Author: Daniel
 */
public class Task {
    @NotNull
    private String taskName;

    private String start;

    private String finish;

    public Task() {}

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }
}
