package com.example.todo.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TodoRequestDto {
    private String task;
    private String description;
    private Date date;
    private String priority;
}
