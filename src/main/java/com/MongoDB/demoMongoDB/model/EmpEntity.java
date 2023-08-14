package com.MongoDB.demoMongoDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "EmployeeDetails")
public class EmpEntity {
     @Id
    private String id;
    private String firstName;
    private String lastName;
    private Integer age;
}
