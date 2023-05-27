package com.example.practice16.controllers;

import com.example.practice16.dao.BookDAO;
import com.example.practice16.models.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookDAO bookDAO;

    @GetMapping()
    public List<Book> getBooks(){
        return bookDAO.findAll();
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Book book){
        this.bookDAO.addBook(book);
    }

    @DeleteMapping("/delete/{name}")
    public void deleteBook(@PathVariable("name") String name){
        bookDAO.deleteBook(name);
    }

}
