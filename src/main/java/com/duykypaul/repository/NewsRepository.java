package com.duykypaul.repository;

import com.duykypaul.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NewsRepository extends JpaRepository<NewsEntity, Long> {
    Optional<NewsEntity> findById(Long id);
}
