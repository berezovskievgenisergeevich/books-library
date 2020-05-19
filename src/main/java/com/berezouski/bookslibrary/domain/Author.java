package com.berezouski.bookslibrary.domain;

@javax.persistence.Entity
public class Author extends Entity {
    public Author() {
    }

    public Author(String name) {
        super(name);
    }

    public Author(int id, String name) {
        super(id, name);
    }
}
