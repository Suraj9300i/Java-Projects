package com.example.todo.interfaces;

import java.util.UUID;

import com.example.todo.dto.TodoRequestDto;

public interface ITodo {
    
    public void addTodo(TodoRequestDto todo);

    public void updateTodo(UUID id);

    public void deleteTodo(UUID id);

    public void getTodo();

    public void getTodoOnDate();

    public void getTodoOfToday();

    public void getTodoByPriority();
}
