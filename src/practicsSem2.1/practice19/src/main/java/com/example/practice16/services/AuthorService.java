package com.example.practice16.services;

import com.example.practice16.models.Author;
import com.example.practice16.repositories.AuthorRepository;
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
public class AuthorService {
    private final AuthorRepository authorRepository;
    @PersistenceContext
    private EntityManager em;

    public List<Author> findAll() {
        log.info("Find all Authors");
        return authorRepository.findAll();
    }

    public void addAuthor(Author author) {
        authorRepository.save(author);
    }

    public void deleteAuthor(String name) {
        authorRepository.delete(Objects.requireNonNull(findAuthorByName(name)));
    }

    private Author findAuthorByName(String name) {
        for (Author w : findAll()) {
            if (Objects.equals(w.getFirstname(), name))
                return w;
        }
        return null;
    }

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
