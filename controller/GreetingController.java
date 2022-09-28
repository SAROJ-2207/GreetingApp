package com.example.greetingcontroller1.controller;

import com.example.greetingcontroller1.model.GreetingModel;
import com.example.greetingcontroller1.model.User;
import com.example.greetingcontroller1.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private IGreetingService greetingService;

    //IT WILL CREATE INPUT  DATA AND STORE DATABASE
    @GetMapping (value = {"/create"})
    public GreetingModel addGreeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }

    @GetMapping (value = {"/name"})
    public GreetingModel addFullName(@RequestParam(value = "firstName", defaultValue = "first") String firstName,
                                     @RequestParam(value = "lastName", defaultValue = " last") String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }

    @GetMapping("/getbyid/{id}")
    public GreetingModel findGreetingById(@PathVariable long id) {

        return greetingService.getGreetingById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMessageById(@PathVariable long id) {

        return this.greetingService.deleteMessageById(id);
    }

    @PutMapping("/update")
    public GreetingModel editGreeting(GreetingModel greeting) {
        return greetingService.editGreeting(greeting);
    }

    @GetMapping("/getall")
    public List<GreetingModel> getAllGreetings() {

        return greetingService.getAllGreetings();
    }

}





