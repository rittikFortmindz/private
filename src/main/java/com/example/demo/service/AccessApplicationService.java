package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.AccessApplicationRequest;
import com.example.demo.entity.AccessApplication;
import com.example.demo.repositories.AccessApplicationRepository;

@Service
public class AccessApplicationService {

    private final AccessApplicationRepository repository;

    public AccessApplicationService(AccessApplicationRepository repository) {
        this.repository = repository;
    }

    public void submit(AccessApplicationRequest request) {

        if (repository.existsByEmail(request.getEmail())) {
            throw new IllegalStateException("Application already exists");
        }

        AccessApplication app = new AccessApplication();
        app.setName(request.getName());
        app.setCity(request.getCity());
        app.setAge(request.getAge());
        app.setIntent(request.getIntent());
        app.setEmail(request.getEmail());

        repository.save(app);
    }
}
