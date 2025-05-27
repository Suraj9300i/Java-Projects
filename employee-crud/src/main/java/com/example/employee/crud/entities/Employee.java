package com.example.employee.crud.entities;

import java.util.UUID;

import com.example.employee.crud.enums.Sex;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private UUID id;

    private String email;

    private String name;

    private Long phoneNumber;

    private Integer age;

    private Sex sex;
}
