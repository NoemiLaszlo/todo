package com.codecool.todo.service;

import com.codecool.todo.model.Status;
import com.codecool.todo.model.Todo;
import com.codecool.todo.repository.TodoRepository;
import org.springframework.stereotype.Component;

@Component
public class InitializerBean {

    public InitializerBean(TodoRepository todoService) {
        todoService.save(new Todo("First TODO", Status.ACTIVE));
        todoService.save(new Todo("Second TODO", Status.ACTIVE));
        todoService.save(new Todo("Third TODO", Status.ACTIVE));

    }
}