package com.MongoDB.demoMongoDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MongoDB.demoMongoDB.model.EmpEntity;
import com.MongoDB.demoMongoDB.repository.EmpRepo;

@Service
public class EmpService {

     @Autowired
    private final EmpRepo empRepo;
    
    
    public EmpService(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }

    public List<EmpEntity> getAllEmployees() {
        return empRepo.findAll();
    }

    public EmpEntity addEmployee(EmpEntity employee) {
        return empRepo.save(employee);
    }

    public EmpEntity getEmployeeById(String id) {
        return empRepo.findById(id).orElse(null);
    }

    public void deleteEmployeeById(String id) {
        empRepo.deleteById(id);
    }
    
}
