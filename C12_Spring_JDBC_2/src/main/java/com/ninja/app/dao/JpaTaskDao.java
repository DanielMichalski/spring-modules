package com.ninja.app.dao;

import com.ninjaapp.students.model.Task;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Author: Daniel
 */
@Repository
@RepositoryQualifier(type = RepositoryType.JPA)
public class JpaTaskDao implements ITaskDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void saveTask(Task task) {
        entityManager.persist(task);
    }

    @Override
    public List<Task> findAllTasks() {
        Query query =
                entityManager.createQuery("from Task");
        return query.getResultList();
    }
}
