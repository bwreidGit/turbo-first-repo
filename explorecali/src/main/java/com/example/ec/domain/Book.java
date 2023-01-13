package com.example.ec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private String bookId;

    @Column
    private String bookTitle;

    @Column
    private String author;

    public Book (String bookId, String bookTitle, String author) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
    }

    protected Book() {}

    public String getBookId() { return this.bookId; }
    public String getBookTitle() { return this.bookTitle; }
    public String getAuthor() { return this.author; }

    public void setBookId(String bookId) { this.bookId = bookId; }
    public void setBookTitle(String bookTitle) { this.bookTitle = bookTitle; }
    public void setAuthor(String author) { this.author = author; }
}

