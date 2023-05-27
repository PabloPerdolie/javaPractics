package com.example.practice16;

import com.example.practice16.models.Author;
import com.example.practice16.repositories.AuthorRepository;
import com.example.practice16.services.AuthorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)

public class AuthorServiceImpITest {
    @Mock
    private AuthorRepository authorRepository;

    @Captor
    ArgumentCaptor<Author> captor;

    @Test
    void getAuthors() {

        Author author = new Author();
        author.setFirstname("Danil");

        Author author2 = new Author();
        author2.setFirstname("Egor");

        Mockito.when(authorRepository.findAll()).thenReturn(List.of(author, author2));

        AuthorService authorService = new AuthorService(authorRepository);
        Assertions.assertEquals(2, authorService.findAll().size());
        Assertions.assertEquals("Danil", authorService.findAll().get(0).getFirstname());

    }


    @Test
    void create() {

        Author author = new Author();
        author.setFirstname("Pablo");

        AuthorService studentService = new AuthorService(authorRepository);

        studentService.addAuthor(author);


        Mockito.verify(authorRepository).save(captor.capture());
        Author captured = captor.getValue();

        Assertions.assertEquals("Pablo", captured.getFirstname());
    }
}
