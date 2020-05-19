package com.berezouski.bookslibrary.repository;

import com.berezouski.bookslibrary.domain.Book;
import com.berezouski.bookslibrary.domain.Entity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@SuppressWarnings("JpaQlInspection")
@Repository
@Transactional
public class EntityRepositoryJpa implements EntityRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void insert(Entity e) {
        em.persist(e);
    }


    public void insert(Book book) {
        em.persist(book);
    }

    @Override
    public Entity getById(int id) {
        return em.find(Entity.class, id);
    }

    @Override
    public Entity getFirst() {
        TypedQuery<Entity> query = em.createQuery(
                "select e from Entity e where e.id = 1",
                Entity.class);
        return query.getSingleResult();
    }

    @Override
    public List<Entity> getAll() {
        TypedQuery<Entity> query = em.createQuery(
                "select e from Entity e",
                Entity.class);

        return query.getResultList();
    }

    @Override
    public Entity getByName(String name) {
        TypedQuery<Entity> query = em.createQuery(
                "select e from Entity e where e.name = :name",
                Entity.class);
        query.setParameter("name", name);
        return query.getSingleResult();
    }
}
