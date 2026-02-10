package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.AccessApplication;

public interface AccessApplicationRepository
        extends MongoRepository<AccessApplication, String> {

    boolean existsByEmail(String email);
}
