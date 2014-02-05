package model;

import java.util.Date;

/**
 * Author: Daniel
 */
public class Task {
    public static TaskBuilder Builder() {
        return new TaskBuilder();
    }

    private long id;

    private String subject;

    private Date startDate;

    private Date closeDate;

    private Task() {
    }

    public String getSubject() {
        return subject;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.Task{");
        sb.append("id=").append(id);
        sb.append(", subject='").append(subject).append('\'');
        sb.append(", startDate=").append(startDate);
        sb.append(", closeDate=").append(closeDate);
        sb.append('}');
        return sb.toString();
    }

    public static class TaskBuilder {
        private Task task;

        private TaskBuilder() {
            task = new Task();
        }

        public TaskBuilder withId(long id) {
            task.id = id;
            return this;
        }

        public TaskBuilder withSubject(String subject){
            task.subject = subject;
            return this;
        }

        public TaskBuilder withStartDate(Date startDate){
            task.startDate = startDate;
            return this;
        }

        public TaskBuilder withCloseDate(Date closeDate){
            task.closeDate = closeDate;
            return this;
        }

        public Task build() {
            return task;
        }
    }
}
