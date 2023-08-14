package com.MongoDB.demoMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoDB.demoMongoDB.model.EmpEntity;

public interface EmpRepo extends MongoRepository<EmpEntity, String>{
    
}
