package com.berezouski.bookslibrary.repository;

import com.berezouski.bookslibrary.domain.Entity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EntityRepository extends CrudRepository<Entity, Integer> {
    List<Entity> findAll();
}
