package com.berezouski.bookslibrary.dao;

import com.berezouski.bookslibrary.domain.Author;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorDao extends EntityDaoJdbc {
    public AuthorDao(JdbcOperations jdbc, NamedParameterJdbcOperations namedParameterJdbcOperations) {
        super(jdbc, namedParameterJdbcOperations);
        entity = Author.class;
    }
}
