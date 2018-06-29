package com.codecool.todo.api;

import com.codecool.todo.model.Todo;
import com.codecool.todo.repository.TodoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoREST {

    private TodoRepository todoService;

    public TodoREST(TodoRepository todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/list")
    public List<Todo> getAllTodos() {
        return todoService.findAll();
    }

    //kifejleszetni ajs alapján a különöző route-okra a lekéréseket

}