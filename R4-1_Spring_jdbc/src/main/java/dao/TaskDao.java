package dao;

import model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Daniel
 */
@Repository
public class TaskDao {
    private SimpleJdbcInsert taskInsert;

    @Autowired
    public TaskDao(DataSource dataSource) {
       taskInsert = new SimpleJdbcInsert(dataSource).withTableName("task");
    }

    public void saveTask(Task task) {
        Map<String, Object> params = new HashMap<String, Object>();

        params.put("subject", task.getSubject());
        params.put("start_time", task.getStartDate().getTime());
        params.put("close_time", task.getCloseDate().getTime());

        taskInsert.execute(params);
    }
}
