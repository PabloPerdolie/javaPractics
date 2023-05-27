package com.example.practice16.controllers;

import com.example.practice16.dao.AuthorDAO;
import com.example.practice16.models.Author;
import com.example.practice16.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorDAO authorDAO;
    private final AuthorService authorService;

    @GetMapping()
    public List<Author> getAuthors() {
        return authorDAO.findAll();
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Author author) {
        authorDAO.addAuthor(author);
    }

    @DeleteMapping("/delete/{firstName}")
    public void deleteAuthor(@PathVariable("firstName") String firstName) {
        authorDAO.deleteAuthor(firstName);
    }

    @GetMapping("/sortByLastName")
    public List<Author> sortAuthorLastName() {
        return authorService.sortAuthorByLastName();
    }

    @GetMapping("/sortByFirstName")
    public List<Author> sortAuthorFirstName() {
        return authorService.sortAuthorByFirstName();
    }

    @GetMapping("/sortByMiddleName")
    public List<Author> sortAuthorMiddleName() {
        return authorService.sortAuthorByMiddleName();
    }
}
