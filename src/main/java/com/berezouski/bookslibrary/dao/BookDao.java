package com.berezouski.bookslibrary.dao;

import com.berezouski.bookslibrary.domain.Book;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao extends EntityDaoJdbc {
    public BookDao(JdbcOperations jdbc, NamedParameterJdbcOperations namedParameterJdbcOperations) {
        super(jdbc, namedParameterJdbcOperations);
        entity = Book.class;
    }
}
