package com.MongoDB.demoMongoDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MongoDB.demoMongoDB.model.Department;
import com.MongoDB.demoMongoDB.repository.DepartmentRepo;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }

    public Department addDepartment(Department department) {
        return departmentRepo.save(department);
    }

    public Department getDepartmentById(String id) {
        return departmentRepo.findById(id).orElse(null);
    }

    public void deleteDepartmentById(String id) {
        departmentRepo.deleteById(id);
    }
    
}
