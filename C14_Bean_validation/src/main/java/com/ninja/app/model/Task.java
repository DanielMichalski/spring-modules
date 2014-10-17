package com.ninja.app.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Author: Daniel
 */
public class Task {
    @NotNull
    private long id;

    @Max(value = 12)
    private String name;

    private Date startDate;

    private Date endtDate;

    public Task() {
    }

    public Task(long id, String name, Date startDate, Date endtDate) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endtDate = endtDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndtDate() {
        return endtDate;
    }

    public void setEndtDate(Date endtDate) {
        this.endtDate = endtDate;
    }
}
