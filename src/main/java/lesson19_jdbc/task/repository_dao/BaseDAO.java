package lesson19_jdbc.task.repository_dao;

import java.util.List;

public interface BaseDAO<T> {
    boolean add(T obj);

    boolean delete(T obj);

    T findByID(int id);

    List<T> findAll();
}
