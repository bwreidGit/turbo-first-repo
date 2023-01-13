package com.example.ec.Web;

import com.example.ec.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/book")
public class BookController {
    // private BookRepository bookRepository

    @Autowired
    public BookController() {
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Book book) {
    }

    @GetMapping(path = "/{books}")
    public List<Book> getAllBooks() {
        return null;
    }

    @GetMapping(path = "/{bookId}")
    public Book getOneBook(@PathVariable(value = "bookId") String bookId) {
        return null;
    }

    @PutMapping(path = "/{bookId}")
    public Book updateAll(@PathVariable(value = "bookId") String bookId,
    @RequestBody Book book) {
        return null;
    }

    @PatchMapping(path = "/{bookId}")
    public Book updateSome(@PathVariable(value = "bookId") String bookId,
                           @RequestBody Book book) {
        return null;
    }

    @DeleteMapping(path = "/{bookId}")
    public void delete(@PathVariable(value = "bookId") String bookId) {
    }

}
