package com.example.demos.hibernate.repositories;

import com.example.demos.hibernate.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
