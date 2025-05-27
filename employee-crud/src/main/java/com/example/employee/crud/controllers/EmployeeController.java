package com.example.employee.crud.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    
    @PostMapping("/create")
    public String createEmployee(){
        return "create";
    }

    @PutMapping("/update")
    public void updateEmployee(){}

    @PatchMapping("/update/email")
    public void updateEmployeeEmail(){}

    @PatchMapping("/update/number")
    public void updateEmployeeNumber(){}

    @DeleteMapping("/delete")
    public void deleteEmployee(){}

    @GetMapping("/")
    public void getAllEmpoyees(){}

    @GetMapping("/{email}")
    public void getEmpoyeeByEmail(){}

}
