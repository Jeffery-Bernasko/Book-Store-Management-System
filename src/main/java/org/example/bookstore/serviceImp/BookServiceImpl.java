package org.example.bookstore.serviceImp;

import lombok.AllArgsConstructor;
import org.example.bookstore.model.Book;
import org.example.bookstore.repository.BookRepository;
import org.example.bookstore.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;


    //Add a Book and Save
    public void saveBook(Book book) {
         bookRepository.save(book);
    }

    //Get All Books
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(Integer id) {
        return bookRepository.findById(id).get();
    }
}
