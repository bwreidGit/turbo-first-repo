package com.example.ec.Web;

import com.example.ec.domain.Book;
import com.example.ec.domain.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/library")
public class LibraryController {
    //private LibraryRepository libraryRepository;

    @Autowired
    public LibraryController(/*LibraryRepository libraryRepository*/) {
        // this.libraryRepository = libraryRepository
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Library library) {
    }

    @GetMapping(path = "/{libraryId}")
    public Library getOneLibrary(@PathVariable(value = "libraryId") String libraryId) {
        return null;
    }

    @PutMapping(path = "/{libraryId}")
    public Library updateAll(@PathVariable(value = "libraryId") String libraryId,
                          @RequestBody Library library) {
        return null;
    }

    @PatchMapping(path = "/{libraryId}")
    public Library updateSome(@PathVariable(value = "libraryId") String libraryId,
                           @RequestBody Library library) {
        return null;
    }

    @DeleteMapping(path = "/{libraryId}")
    public void delete(@PathVariable(value = "libraryId") String libraryId) {
    }
}
