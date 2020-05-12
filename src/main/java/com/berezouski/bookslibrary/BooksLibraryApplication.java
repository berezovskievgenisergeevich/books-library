package com.berezouski.bookslibrary;

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


        Console.main(args);
    }

}
