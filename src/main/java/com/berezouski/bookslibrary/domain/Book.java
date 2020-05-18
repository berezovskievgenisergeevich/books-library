package com.berezouski.bookslibrary.domain;

public class Book extends Entity {
    private final int genreId;
    private final int authorId;

    public Book(int id, String name, int genreId, int authorId) {
        super(id, name);
        this.genreId = genreId;
        this.authorId = authorId;
    }

    public int getGenreId() {
        return genreId;
    }

    public int getAuthorId() {
        return authorId;
    }
}
