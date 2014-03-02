package com.ninjaapp.students.service;

import com.ninjaapp.students.dao.IStudentsDao;
import com.ninjaapp.students.dao.RepositoryQualifier;
import com.ninjaapp.students.dao.RepositoryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: Daniel
 */
@Component
public class StudentsService {
    @Autowired
    @RepositoryQualifier(repositoryType = RepositoryType.JDBC)
    private IStudentsDao studentsDao;

    public boolean isStudent(String name) {
        return studentsDao.isStudent(name);
    }
}
