package com.berezouski.bookslibrary;

import com.berezouski.bookslibrary.domain.Book;
import com.berezouski.bookslibrary.service.utils.BookService;
import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BooksLibraryApplication {

    public static void main(String[] args) throws SQLException {
        ApplicationContext context = SpringApplication.run(BooksLibraryApplication.class, args);

        BookService bookService = context.getBean(BookService.class);

        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            books.add(new Book("name " + i, i, i));
        }
        bookService.addBooks(books);
        bookService.getBooks().forEach(System.out::println);
        System.out.println("bookService.getBookById(3) = " + bookService.getBookById(3));
        System.out.println("bookService.getBookByAuthorId(5) = " + bookService.getBookByAuthorId(5));

      /*  EntityService entityService = context.getBean(EntityService.class);
        entityService.addEntity(new Author("Test"));
        entityService.getEntityList().forEach(System.out::println);*/


        Console.main(args);
    }

}
