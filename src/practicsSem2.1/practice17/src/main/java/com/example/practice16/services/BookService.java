package com.example.practice16.services;

import com.example.practice16.models.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    @PersistenceContext
    private EntityManager em;

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
