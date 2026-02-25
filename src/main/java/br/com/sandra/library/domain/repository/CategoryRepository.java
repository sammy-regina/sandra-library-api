package br.com.sandra.library.domain.repository;

import br.com.sandra.library.domain.model.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CategoryRepository extends JpaRepository<CategoryEntity, UUID> {
}
