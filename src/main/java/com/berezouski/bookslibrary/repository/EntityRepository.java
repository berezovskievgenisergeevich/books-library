package com.berezouski.bookslibrary.repository;

import com.berezouski.bookslibrary.domain.Entity;

import java.util.List;

public interface EntityRepository {
    void insert(Entity e);

    Entity getById(int id);

    Entity getFirst();

    List<Entity> getAll();

    Entity getByName(String name);
}
