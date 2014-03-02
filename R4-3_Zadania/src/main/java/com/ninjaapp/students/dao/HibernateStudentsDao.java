package com.ninjaapp.students.dao;

import com.ninjaapp.students.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: Daniel
 */
@Repository
@RepositoryQualifier(repositoryType = RepositoryType.HIBERNATE)
public class HibernateStudentsDao implements IStudentsDao {
    @Autowired
    @Qualifier (value = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public boolean isStudent(String name) {
        boolean isStudent = false;

        List students = sessionFactory
                .openSession()
                .createCriteria(Student.class)
                .add(Restrictions
                        .eq("name", name)).list();

        if (students.size() > 0) {
            isStudent = true;
        }

        return isStudent;
    }
}
