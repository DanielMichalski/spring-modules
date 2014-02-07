package dao;

import model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Author: Daniel
 */
@Repository
@RepositoryQualifier(type = RepositoryType.JDBC)
public class JdbcTaskDao implements ITaskDao {
    private SimpleJdbcInsert taskInsert;

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcTaskDao(DataSource dataSource) {
        taskInsert = new SimpleJdbcInsert(dataSource).withTableName("task");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void saveTask(Task task) {
        try {
            Map<String, Object> params = task.toMapWith().
                    subject().
                    startDate().
                    closeDate().
                    build();

            taskInsert.execute(params);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override
    public List findAllTasks() {
        return jdbcTemplate.query("SELECT * FROM TASK;", new TaskMapper());
    }

    public class TaskMapper implements RowMapper<Task> {
        @Override
        public Task mapRow(ResultSet rs, int i) throws SQLException {
            return Task.Builder()
                    .withId(rs.getLong("id"))
                    .withSubject(rs.getString("subject"))
                    .withStartDate(new Date(rs.getLong("start_time")))
                    .withCloseDate(new Date(rs.getLong("close_time")))
                    .build();
        }
    }
}
