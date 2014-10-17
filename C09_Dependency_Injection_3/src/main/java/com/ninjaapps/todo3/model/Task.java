package com.ninjaapps.todo3.model;

/**
 * Author: Daniel
 */
public class Task {
    private Long id;

    public Task(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Task{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
