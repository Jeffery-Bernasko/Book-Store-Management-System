package org.example.bookstore.controller;

import lombok.AllArgsConstructor;
import org.example.bookstore.model.Book;
import org.example.bookstore.model.BookList;
import org.example.bookstore.service.BookListService;
import org.example.bookstore.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookController {
    private final BookService bookService;
    private final BookListService bookListService;
    @GetMapping("/")
    public String home(){
        return "Home";
    }

    // Book Registration Endpoint
    @GetMapping("/book_register")
    public String bookRegister(){
        return "bookRegister";
    }

    // Available Books Endpoint

    @GetMapping("/available_books")
    public ModelAndView availableBooks(){
        List<Book> bookList = bookService.getAllBooks();

        // Model and View Obj
//        ModelAndView modelView = new ModelAndView();
//        modelView.setViewName("availableBooks");
//        modelView.addObject("book",bookList);
        return new ModelAndView("availableBooks","book",bookList);
    }

    @GetMapping("/my_books")
    public String myBooks(Model model){
        List<BookList> myBookList = bookListService.getAllMyBooks();
        model.addAttribute("book",myBookList);
        return "myBooks";
    }

    //A POST Method to add a book
    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book){
         bookService.saveBook(book);
        return "redirect:/available_books";
    }

    @RequestMapping ("/mylist/{id}")
    public String getMybooks(@PathVariable Integer id){
          bookListService.addBookToMyList(id);
        return "redirect:/my_books";
    }
}
