package com.berezouski.bookslibrary.service.utils;

import com.berezouski.bookslibrary.domain.Book;
import com.berezouski.bookslibrary.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void addBooks(List<Book> books) {
        books.forEach(book -> addBook(book));
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id);
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book getBookByAuthorId(int id) {
        return bookRepository.getBookByAuthorId(id);
    }

}
