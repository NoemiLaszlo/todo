package com.codecool.todo.model;

import javax.persistence.*;


@Entity
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "status")
    private Status status;

    public Todo() {
    }

    public Todo(String title, Status status) {
        this.title = title;
        this.id = id;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isCompleted() {
        return this.status == Status.COMPLETE;
    }

    public static Todo create(String title) {
        return new Todo(title, Status.ACTIVE);
    }

    @Override
    public String toString() {
        return String.format("Todo[title='%s', status='%s']", title, status);
    }


}
