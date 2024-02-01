package org.example.bookstore.service;

import org.example.bookstore.model.Book;

import java.util.List;

public interface BookService {
    void saveBook(Book book);

    List<Book> getAllBooks();

    Book getBookById(Integer id);
}
