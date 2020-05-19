package com.berezouski.bookslibrary;

import com.berezouski.bookslibrary.dao.AuthorDao;
import com.berezouski.bookslibrary.dao.BookDao;
import com.berezouski.bookslibrary.domain.Author;
import com.berezouski.bookslibrary.domain.Book;
import com.berezouski.bookslibrary.domain.Entity;
import com.berezouski.bookslibrary.repository.AuthorRepositoryJpa;
import com.berezouski.bookslibrary.repository.BookRepositoryJpa;
import com.berezouski.bookslibrary.repository.EntityRepositoryJpa;
import com.berezouski.bookslibrary.service.comments.AddCommentUtils;
import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class BooksLibraryApplication {

    public static void main(String[] args) throws SQLException {
        ApplicationContext context = SpringApplication.run(BooksLibraryApplication.class, args);


      /*  AuthorRepositoryJpa repository = context.getBean(AuthorRepositoryJpa.class);
        Author author = new Author("Тестовый Автор");
        repository.getAll().forEach(System.out::println);
        repository.insert(author);
        repository.getAll().forEach(System.out::println);*/

        BookRepositoryJpa bookRepository = context.getBean(BookRepositoryJpa.class);
        Book book = new Book("Test", 1, 1);
        bookRepository.insert(book);

        AddCommentUtils commentUtils = context.getBean(AddCommentUtils.class);
        commentUtils.addComment(book, "Test comment add");

        System.out.println(bookRepository.getByName("Test"));

        Console.main(args);
    }

}
