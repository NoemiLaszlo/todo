package com.codecool.todo.controller;

import com.codecool.todo.model.Todo;
import com.codecool.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexController {

    private TodoRepository todoRepository;

    @Autowired
    public IndexController(TodoRepository todoService) {
        this.todoRepository = todoService;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public String addTodo(Todo todo) {
        todoRepository.save(todo);
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    protected String doGet(Model model) {

        return "index";
    }


}




