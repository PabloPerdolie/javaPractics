package com.example.practice16.dao;

import com.example.practice16.models.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@Component
@Transactional
public class BookDAO {
    @PersistenceContext
    private EntityManager em;

    public List<Book> findAll() {
        Session session = em.unwrap(Session.class);
        return session.createQuery("SELECT f from Book f", Book.class).getResultList();
    }

    public void addBook(Book book) {
        Session session = em.unwrap(Session.class);
        session.persist(book);
        session.close();
    }

    public void deleteBook(String name) {
        Session session = em.unwrap(Session.class);

        String hql = ("From Book where name =: name");

        Object book = session.createQuery(hql).setParameter("name", name).getSingleResult();
        session.remove(book);
        session.close();
    }
}