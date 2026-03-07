package br.com.sandra.library.api.controller;

import br.com.sandra.library.domain.model.BookEntity;
import br.com.sandra.library.domain.model.CategoryEntity;
import br.com.sandra.library.domain.repository.CategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryRepository repository;

    public CategoryController(CategoryRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<CategoryEntity> create(@RequestBody CategoryEntity category) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(category));
    }

    @GetMapping
    public List<CategoryEntity> listAll() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryEntity> update(@PathVariable UUID id,
                                                 @RequestBody CategoryEntity categoryDetails) {
        return repository.findById(id)
                .map(category -> {
                    category.setName(categoryDetails.getName());
                    CategoryEntity updatedCategory = repository.save(category);
                    return ResponseEntity.ok(updatedCategory);
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
