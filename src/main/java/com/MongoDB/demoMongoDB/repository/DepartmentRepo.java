package com.MongoDB.demoMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoDB.demoMongoDB.model.Department;

public interface DepartmentRepo extends MongoRepository<Department, String> {
    
}
