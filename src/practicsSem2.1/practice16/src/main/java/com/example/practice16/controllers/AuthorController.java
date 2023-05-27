package com.example.practice16.controllers;

import com.example.practice16.dao.AuthorDAO;
import com.example.practice16.models.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorDAO authorDAO;

    @GetMapping()
    public List<Author> getAuthors(){
        return authorDAO.findAll();
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Author author){
        authorDAO.addAuthor(author);
    }

    @DeleteMapping("/delete/{firstName}")
    public void deleteAuthor(@PathVariable("firstName") String firstName){
        authorDAO.deleteAuthor(firstName);
    }
}
