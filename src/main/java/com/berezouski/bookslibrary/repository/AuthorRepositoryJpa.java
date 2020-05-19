package com.berezouski.bookslibrary.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("JpaQlInspection")
@Repository
@Transactional
public class AuthorRepositoryJpa extends EntityRepositoryJpa {
}
