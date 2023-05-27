package com.example.practice16.controllers;

import com.example.practice16.models.Author;
import com.example.practice16.services.AuthorService;
import com.example.practice16.services.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;
    private final EmailService emailService;

    @GetMapping()
    public List<Author> getAuthors(){
        return authorService.findAll();
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Author author){
        emailService.sendAddAuthorEmail(author);
        authorService.addAuthor(author);
    }

    @DeleteMapping("/delete/{firstName}")
    public void deleteAuthor(@PathVariable("firstName") String firstName){
        authorService.deleteAuthor(firstName);
    }

    @GetMapping("/sortByLastName")
    public List<Author> sortAuthorLastName(){return authorService.sortAuthorByLastName();}

    @GetMapping("/sortByFirstName")
    public List<Author> sortAuthorFirstName(){return authorService.sortAuthorByFirstName();}

    @GetMapping("/sortByMiddleName")
    public List<Author> sortAuthorMiddleName(){return authorService.sortAuthorByMiddleName();}
}
