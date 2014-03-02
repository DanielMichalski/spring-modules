package com.ninjaapp.students.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Author: Daniel
 */
@Repository
@RepositoryQualifier(repositoryType = RepositoryType.JDBC)
public class JdbcStudentsDao implements IStudentsDao {
    private JdbcTemplate jdbc;

    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        this.jdbc = new JdbcTemplate(dataSource);
    }

    @Override
    public boolean isStudent(String name) {
        boolean isStudent = false;

        SqlRowSet sqlRowSet =
                jdbc.queryForRowSet("" +
                        "SELECT * FROM Students WHERE  name=?", name);
        if (sqlRowSet.next()) {
            isStudent = true;
        }

        return isStudent;
    }
}
