package com.example.practice16.controllers;

import com.example.practice16.models.Book;
import com.example.practice16.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping()
    public List<Book> getBooks() { return bookService.findAll(); }

    @PostMapping("/add")
    public void addBook(@RequestBody Book book) { this.bookService.addBook(book); }

    @DeleteMapping("/delete/{name}")
    public void deleteBook(@PathVariable("name") String name) { bookService.deleteBook(name); }

    @GetMapping("/sortByName")
    public List<Book> sortBookName() { return bookService.sortBookByName(); }

    @GetMapping("/sortByCrDate")
    public List<Book> sortBookByCrDate() { return bookService.sortBookByCrDate(); }
}
