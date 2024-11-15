package com.example.todo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/")
public class BaseController {
    
    @GetMapping("/")
    public String index() {
        return "Server is running";
    }
    
}
