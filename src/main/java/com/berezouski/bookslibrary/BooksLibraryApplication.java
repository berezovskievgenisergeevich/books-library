package com.berezouski.bookslibrary;

import com.berezouski.bookslibrary.dao.AuthorDao;
import com.berezouski.bookslibrary.dao.BookDao;
import com.berezouski.bookslibrary.domain.Author;
import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class BooksLibraryApplication {

    public static void main(String[] args) throws SQLException {
        ApplicationContext context = SpringApplication.run(BooksLibraryApplication.class, args);
        System.out.println("Hello World");

        AuthorDao authorDao = context.getBean(AuthorDao.class);
        BookDao bookDao = context.getBean(BookDao.class);

        System.out.println("All count AUT " + authorDao.count());
        System.out.println("All count BOOK " + bookDao.count());

        authorDao.printAll();
        authorDao.insert(new Author(2,"Лев Толстой"));
        authorDao.printAll();
        authorDao.deleteById(2);
        authorDao.printAll();


        bookDao.getAll().forEach(System.out::println);


        Console.main(args);
    }

}
