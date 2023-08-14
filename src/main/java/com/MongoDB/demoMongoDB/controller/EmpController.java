package com.MongoDB.demoMongoDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MongoDB.demoMongoDB.model.EmpEntity;
import com.MongoDB.demoMongoDB.service.EmpService;

@RestController
public class EmpController {

    @Autowired
    private final EmpService empService;

    public EmpController(EmpService empService) {
        this.empService = empService;
    }

    @GetMapping("/listofdetails")
    public List<EmpEntity> getAllEmployees() {
        return empService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmpEntity getEmployeeById(@PathVariable String id) {
        return empService.getEmployeeById(id);
    }

    @PostMapping("/create")
    public EmpEntity addEmployee(@RequestBody EmpEntity employee) {
        return empService.addEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable String id) {
        empService.deleteEmployeeById(id);
    }
    
}
