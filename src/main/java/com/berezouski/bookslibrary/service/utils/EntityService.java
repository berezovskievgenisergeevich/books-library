package com.berezouski.bookslibrary.service.utils;

import com.berezouski.bookslibrary.domain.Entity;
import com.berezouski.bookslibrary.repository.EntityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {
    private EntityRepository entityRepository;

    public EntityService(EntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    public List<Entity> getEntityList() {
        return entityRepository.findAll();
    }

    public void addEntity(Entity entity) {
        entityRepository.save(entity);
    }
}
