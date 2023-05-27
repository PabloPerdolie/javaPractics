package com.example.practice16.services;

import com.example.practice16.models.Author;
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
public class AuthorService {
    @PersistenceContext
    private EntityManager em;

    public List<Author> sortAuthorByFirstName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Author> authorCriteriaQuery = builder.createQuery(Author.class);
        Root<Author> root = authorCriteriaQuery.from(Author.class);

        authorCriteriaQuery.select(root).orderBy(builder.asc(root.get("firstName")));
        return session.createQuery(authorCriteriaQuery).getResultList();
    }
    public List<Author> sortAuthorByLastName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Author> authorCriteriaQuery = builder.createQuery(Author.class);
        Root<Author> root = authorCriteriaQuery.from(Author.class);

        authorCriteriaQuery.select(root).orderBy(builder.asc(root.get("lastName")));
        return session.createQuery(authorCriteriaQuery).getResultList();
    }
    public List<Author> sortAuthorByMiddleName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Author> authorCriteriaQuery = builder.createQuery(Author.class);
        Root<Author> root = authorCriteriaQuery.from(Author.class);

        authorCriteriaQuery.select(root).orderBy(builder.asc(root.get("middleName")));
        return session.createQuery(authorCriteriaQuery).getResultList();
    }
}
