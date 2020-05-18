package com.berezouski.bookslibrary.dao;

import com.berezouski.bookslibrary.domain.Entity;
import com.berezouski.bookslibrary.domain.EntityGeneral;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@SuppressWarnings({"SqlNoDataSourceInspection", "ConstantConditions", "SqlDialectInspection"})
@Repository
public abstract class EntityDaoJdbc implements EntityDao {

    protected Class<? extends EntityGeneral> entity;
    protected final JdbcOperations jdbc;
    protected final NamedParameterJdbcOperations namedParameterJdbcOperations;

    public EntityDaoJdbc(JdbcOperations jdbc, NamedParameterJdbcOperations namedParameterJdbcOperations) {
        this.jdbc = jdbc;
        this.namedParameterJdbcOperations = namedParameterJdbcOperations;
    }

    @Override
    public int count() {
        return jdbc.queryForObject("select count(*) from " + getEntityName(), Integer.class);
    }

    private String getEntityName() {
        return entity.getSimpleName().toLowerCase();
    }

    @Override
    public void insert(Entity entity) {
        jdbc.update("insert into " + getEntityName() + " (id, name) values(?,?)", entity.getId(), entity.getName());

    }

    @Override
    public Entity getById(int id) {
        Map<String, Object> params = Collections.singletonMap("id", id);
        return namedParameterJdbcOperations.queryForObject(
                "select * from " + getEntityName() + " where id = :id", params, new EntityMapper());
    }

    @Override
    public List<Entity> getAll() {
        return jdbc.query("select * from " + getEntityName(), new EntityMapper());
    }

    @Override
    public void deleteById(int id) {
        Map<String, Object> params = Collections.singletonMap("id", id);
        namedParameterJdbcOperations.update("delete from " + getEntityName() + " where id = :id", params);

    }

    public void printAll() {
        getAll().forEach(System.out::println);
        System.out.println("-".repeat(25));
    }

    private static class EntityMapper implements RowMapper<Entity> {

        @Override
        public Entity mapRow(ResultSet resultSet, int i) throws SQLException {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            return new Entity(id, name);
        }
    }

}
