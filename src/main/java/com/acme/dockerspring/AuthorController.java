package com.acme.dockerspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @GetMapping("/")
    public List<Author> getAuthors(){
        List<Author> authors = List.of(
                new Author(1, "Martin Fowler"),
                new Author(2, "Robert Martin"),
                new Author(3, "Eric Evans"));
        return authors;
    }
}
