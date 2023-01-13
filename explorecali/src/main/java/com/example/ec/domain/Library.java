package com.example.ec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Library {

    @Id
    private String libraryId;

    @Column
    private String name;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private List<String> bookIds;

    public Library (String libraryId, String name, String city, String state, List<String> bookIds) {
        this.libraryId = libraryId;
        this.name = name;
        this.city = city;
        this.state = state;
        this.bookIds = bookIds;
    }

    protected Library() {
    }

    public String getLibraryId() { return this.libraryId; }
    public String getName() { return this.name; }
    public String getCity() { return this.city; }
    public String getState() { return this.state; }
    public List<String> getBookIds() { return this.bookIds; }

    public void setLibraryId(String libraryId) { this.libraryId = libraryId; }
    public void setName(String name) { this.name = name; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setBookIds(List<String> bookIds) { this.bookIds = bookIds; }

    public void AddBook(String bookId) {
        bookIds.add(bookId);
    }

    public void RemoveBook(String bookId) {
        bookIds.removeIf(obj -> obj == bookId);
    }
}
