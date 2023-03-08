package com.example.demos.hibernate;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Runner {
    @Autowired
    private TransactionalService service;

    @PostConstruct
    public void run() {
        service.run();
    }

}
