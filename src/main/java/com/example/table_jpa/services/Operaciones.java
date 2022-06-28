package com.example.table_jpa.services;

import java.util.List;

/**
 *
 * @author admin
 * @param <T>
 */
public interface Operaciones<T> {
    T create(T t);
    T update(T t);
    void delete(int id);
    T read(int id);
    List<T> readAll();
}
