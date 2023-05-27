package com.example.practice16.dao;

import com.example.practice16.models.Author;
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
public class AuthorDAO {
    @PersistenceContext
    private EntityManager em;

    public List<Author> findAll() {
        Session session = em.unwrap(Session.class);
        return session.createQuery("SELECT f from Author f", Author.class).getResultList();
    }

    public void addAuthor(Author author) {
        Session session = em.unwrap(Session.class);
        session.persist(author);
        session.close();
    }

    public void deleteAuthor(String name) {
        Session session = em.unwrap(Session.class);

        String hql = ("From Author where firstname =: firstname");

        Object author = session.createQuery(hql).setParameter("name", name).getSingleResult();
        session.remove(author);
        session.close();
    }
}