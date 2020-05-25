package com.berezouski.bookslibrary;

import com.berezouski.bookslibrary.dao.AuthorDao;
import com.berezouski.bookslibrary.dao.BookDao;
import com.berezouski.bookslibrary.domain.Author;
import com.berezouski.bookslibrary.domain.Entity;
import com.berezouski.bookslibrary.service.utils.BookService;
import com.berezouski.bookslibrary.service.utils.EntityService;
import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class BooksLibraryApplication {

    public static void main(String[] args) throws SQLException {
        ApplicationContext context = SpringApplication.run(BooksLibraryApplication.class, args);

        BookService bookService = context.getBean(BookService.class);

        Console.main(args);
    }

}
