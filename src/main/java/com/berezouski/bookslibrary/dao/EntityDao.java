package com.berezouski.bookslibrary.dao;

import com.berezouski.bookslibrary.domain.Entity;

import java.util.List;

public interface EntityDao {
    int count();
    void insert(Entity entity);
    Entity getById(int id);
    List<Entity> getAll();
    void deleteById(int id);
}
