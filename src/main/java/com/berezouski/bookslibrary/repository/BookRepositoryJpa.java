package com.berezouski.bookslibrary.repository;

import com.berezouski.bookslibrary.domain.Book;
import com.berezouski.bookslibrary.domain.Entity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;

@SuppressWarnings("JpaQlInspection")
@Repository
@Transactional
public class BookRepositoryJpa extends EntityRepositoryJpa {

}
