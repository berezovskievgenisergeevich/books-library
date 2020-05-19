package com.berezouski.bookslibrary.domain;

@javax.persistence.Entity
public class Genre extends Entity {

    public Genre(int id, String name) {
        super(id, name);
    }

    public Genre(String name) {
        super(name);
    }

    public Genre() {
    }
}
