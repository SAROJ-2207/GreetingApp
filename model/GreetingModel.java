package com.example.greetingcontroller1.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GreetingModel {
    @Id
    private Long id;
    private String message;

    public GreetingModel(long id, String message) {
    this.id = id;
    this.message=message;
    }

    public GreetingModel() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
