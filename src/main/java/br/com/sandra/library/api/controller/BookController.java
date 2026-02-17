package br.com.sandra.library.api.controller;


import br.com.sandra.library.domain.model.BookEntity;
import br.com.sandra.library.domain.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<BookEntity> listAll() {
        return repository.findAll();
    }

    @PostMapping
    public BookEntity create(@RequestBody BookEntity book) {
        return repository.save(book);
    }

}