package dao;

import model.Task;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
    public void saveTask(Task task) {

    }

    @Override
    public List<Task> findAllTasks() {
        Query query =
                entityManager.createQuery("from Task");
        return query.getResultList();
    }
}
