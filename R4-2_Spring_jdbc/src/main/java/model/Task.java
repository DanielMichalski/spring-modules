package model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Daniel
 */
@Entity
public class Task {
    public static TaskBuilder Builder() {
        return new TaskBuilder();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (name = "subject")
    private String subject;

    @Column (name = "start_time")
    private Date startDate;

    @Column (name = "close_time")
    private Date closeDate;

    public PropertiesMapBuilder toMapWith() {
        return new PropertiesMapBuilder(this);
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

    public static class PropertiesMapBuilder {
        private Map<String, Object> propertiesMap =
                new HashMap<String, Object>();
        private Task task;

        private PropertiesMapBuilder(Task task) {
            this.task = task;
        }

        public PropertiesMapBuilder subject() {
            propertiesMap.put("subject", task.getSubject());
            return this;
        }

        public PropertiesMapBuilder startDate() {
            propertiesMap.put("start_date",
                    new java.sql.Date(task.getStartDate().getTime()));
            return this;
        }

        public PropertiesMapBuilder closeDate() {
            propertiesMap.put("close_date",
                    new java.sql.Date(task.getCloseDate().getTime()));
            return this;
        }

        public Map<String, Object> build() {
            return propertiesMap;
        }

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
