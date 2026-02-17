package br.com.sandra.library.domain.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.util.UUID;

public record Book(
        UUID id,

        @NotBlank(message = " O título não pode ser vázio. ")
        String title,

        @NotBlank(message = " O autor é obrigatório. ")
        String author,

        @Positive(message = " O número de pápinas deve ser maior que zero. ")
        Integer pages
) {
}