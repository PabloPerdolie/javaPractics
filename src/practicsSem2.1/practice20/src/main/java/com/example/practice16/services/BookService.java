package com.example.practice16.services;

import com.example.practice16.models.Book;
import com.example.practice16.repositories.BookRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookService {
    private final BookRepository bookRepository;
    @PersistenceContext
    private EntityManager em;

    public List<Book> findAll() {
        log.info("Find all books");
        return bookRepository.findAll();
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(String name) {
        bookRepository.delete(Objects.requireNonNull(findBookByName(name)));
    }

    private Book findBookByName(String name) {
        for (Book w : findAll()) {
            if (Objects.equals(w.getName(), name))
                return w;
        }
        return null;
    }

    public List<Book> sortBookByName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Book> bookCriteriaQuery = builder.createQuery(Book.class);
        Root<Book> root = bookCriteriaQuery.from(Book.class);

        bookCriteriaQuery.select(root).orderBy(builder.asc(root.get("name")));
        return session.createQuery(bookCriteriaQuery).getResultList();
    }

    public List<Book> sortBookByCrDate() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Book> bookCriteriaQuery = builder.createQuery(Book.class);
        Root<Book> root = bookCriteriaQuery.from(Book.class);

        bookCriteriaQuery.select(root).orderBy(builder.asc(root.get("creationDate")));
        return session.createQuery(bookCriteriaQuery).getResultList();
    }
}
