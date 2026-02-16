package br.com.sandra.library.api.controller;


import br.com.sandra.library.domain.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public List<Book> listAll() {
        return List.of(
                new Book(UUID.randomUUID(), "Java para iniciantes", "John Doe", 356),
                new Book(UUID.randomUUID(), "Clean Code", "Robert C. Martin", 464)
                );
    }
}
