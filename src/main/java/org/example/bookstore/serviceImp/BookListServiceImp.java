package org.example.bookstore.serviceImp;

import lombok.AllArgsConstructor;
import org.example.bookstore.model.Book;
import org.example.bookstore.model.BookList;
import org.example.bookstore.repository.BookListRepository;
import org.example.bookstore.repository.BookRepository;
import org.example.bookstore.service.BookListService;
import org.example.bookstore.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookListServiceImp implements BookListService {
    private final BookListRepository bookListRepository;
    private final BookService bookService;

    public void saveMyBook(BookList bookList){
        bookListRepository.save(bookList);
    }

    public List<BookList> getAllMyBooks() {
        return bookListRepository.findAll();
    }

    public void addBookToMyList(Integer bookId) {
        Book book = bookService.getBookById(bookId);

        if (book != null) {
            BookList bookList = new BookList();
            bookList.setId(book.getId());
            bookList.setTitle(book.getTitle());
            bookList.setAuthor(book.getAuthor());
            bookList.setPrice(book.getPrice());

            bookListRepository.save(bookList);
        }

    }

    public void deleteById(Integer id) {
        bookListRepository.deleteById(id);
    }

}
