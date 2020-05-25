package com.berezouski.bookslibrary.repository;

import com.berezouski.bookslibrary.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer> {
    Book getBookByAuthorId(int authorId);

    Book findById(int id);

    List<Book> findAll();
}
