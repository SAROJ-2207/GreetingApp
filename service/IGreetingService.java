package com.example.greetingcontroller1.service;

import com.example.greetingcontroller1.model.GreetingModel;
import com.example.greetingcontroller1.model.User;

import java.util.List;

public interface IGreetingService {
    GreetingModel addGreeting(User user);
    GreetingModel getGreetingById(long id);
    String deleteMessageById(long id);
    GreetingModel editGreeting(GreetingModel greeting);
    List<GreetingModel> getAllGreetings();
}
