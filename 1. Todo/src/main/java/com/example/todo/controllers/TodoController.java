package com.example.todo.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.dto.TodoRequestDto;
import com.example.todo.interfaces.ITodo;

@RestController
@RequestMapping("/todo")
public class TodoController implements ITodo{
    
    @Override
    @PostMapping("/")
    public void addTodo(@RequestBody TodoRequestDto todo){

    }

    @Override
    @PutMapping("/{id}")
    public void updateTodo(@RequestParam UUID id){

    }

    @Override
    @DeleteMapping("/{id}")
    public void deleteTodo(@RequestParam UUID id){

    }

    @Override
    @GetMapping("/")
    public void getTodo(){

    }

    @Override
    public void getTodoOnDate(){

    }

    @Override
    public void getTodoOfToday(){

    }

    @Override
    public void getTodoByPriority(){
        
    }   
}
