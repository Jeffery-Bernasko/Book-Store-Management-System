package org.example.bookstore.controller;

import lombok.AllArgsConstructor;
import org.example.bookstore.service.BookListService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class BookListController {
    private final BookListService bookListService;

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable Integer id){
        bookListService.deleteById(id);
        return "redirect:/my_books";
    }
}
