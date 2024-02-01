package org.example.bookstore.service;

import org.example.bookstore.model.Book;
import org.example.bookstore.model.BookList;

import java.util.List;

public interface BookListService {
    void saveMyBook(BookList bookList);

    List<BookList> getAllMyBooks();

    void addBookToMyList(Integer bookId);

    void deleteById(Integer id);
}
