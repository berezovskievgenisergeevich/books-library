package com.berezouski.bookslibrary.domain;

@javax.persistence.Entity
public class Book extends Entity {
    private int genreId;
    private int authorId;

    public Book(int id, String name, int genreId, int authorId) {
        super(id, name);
        this.genreId = genreId;
        this.authorId = authorId;
    }

    public Book(int id, String name) {
        super(id, name);
    }

    public Book(String name) {
        super(name);
    }

    public Book(String name, int genreId, int authorId) {
        super(name);
        this.genreId = genreId;
        this.authorId = authorId;
    }

    public Book() {
    }

    public int getGenreId() {
        return genreId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setComment(String comment) {

    }



    @Override
    public String toString() {
        return "Book{" +
                "genreId=" + genreId +
                ", authorId=" + authorId +
                "} " + super.toString();
    }
}
