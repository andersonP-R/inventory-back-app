package com.anderson.inventory.repositories;

import com.anderson.inventory.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
