package com.example.demos.hibernate;

import com.example.demos.hibernate.entity.TestEntity;
import com.example.demos.hibernate.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TransactionalService {
    @Autowired
    private TestRepository repository;

    public void run(){
        TestEntity entity = new TestEntity();
        entity.setName("e1");
        System.out.println("save entity: " + entity);
        TestEntity savedEntity = repository.save(entity);
        System.out.println("saved entity: " + savedEntity);
        savedEntity.setName("e2");
        System.out.println("update the name...");
        savedEntity = repository.save(savedEntity);

        System.out.println("search by id...");
        TestEntity foundEntity = repository.findById(savedEntity.getId()).orElse(null);
        System.out.println("foundEntity: " + foundEntity);
    }
}
