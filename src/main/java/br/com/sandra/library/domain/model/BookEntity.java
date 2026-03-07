package br.com.sandra.library.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "books")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "O título é obrigatório")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "O autor é obrigatório")
    @Column(name = "author", nullable = false)
    private String author;

    @Min(value = 1, message = "O livro deve ter pelo menos 1 página")
    private Integer pages;

    @NotNull(message = "A categoria é obrigatória")
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    public BookEntity() {
    }

    public BookEntity(String title, String author, Integer pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.category = category;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public Integer getPages() { return pages; }
    public void setPages(Integer pages) { this.pages = pages; }

    public CategoryEntity getCategory() { return category; }
    public void setCategory(CategoryEntity category) { this.category = category; }
}