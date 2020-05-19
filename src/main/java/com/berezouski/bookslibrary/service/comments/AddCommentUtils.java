package com.berezouski.bookslibrary.service.comments;

import com.berezouski.bookslibrary.domain.Book;
import com.berezouski.bookslibrary.domain.Entity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@SuppressWarnings("JpaQlInspection")
@Repository
@Transactional
public class AddCommentUtils {
    @PersistenceContext
    private EntityManager em;

    public void addComment(Book book, String comment) {
        book.setComment(comment);
        em.merge(book);
    }
}
