package com.codegym.repository;

import com.codegym.model.Customer;

import java.util.List;

public interface GeneralRepository<T> {
    List<T> findAll();

    void save(T t);

    T findById(int t);

    void update(int id, T t);

    void remove(int id);
}
