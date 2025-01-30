package com.anderson.inventory.repositories;

import com.anderson.inventory.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
