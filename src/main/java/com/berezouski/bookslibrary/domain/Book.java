package com.berezouski.bookslibrary.domain;

@javax.persistence.Entity
public class Book extends Entity {
    private int genreId;
    private int authorId;
    private String comment;

    public Book() {
    }

    public Book(String name) {
        super(name);
    }

    public Book(int id, String name, int genreId, int authorId) {
        super(id, name);
        this.genreId = genreId;
        this.authorId = authorId;
    }

    public Book(String name, int genreId, int authorId) {
        super(name);
        this.genreId = genreId;
        this.authorId = authorId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getGenreId() {
        return genreId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name=" + getName() +
                ", genreId=" + genreId +
                ", authorId=" + authorId +
                ", comment='" + comment + '\'' +
                '}';
    }
}
