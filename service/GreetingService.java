package com.example.greetingcontroller1.service;

import com.example.greetingcontroller1.model.GreetingModel;
import com.example.greetingcontroller1.model.User;
import com.example.greetingcontroller1.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
   private GreetingRepository greetingRepository;

    @Override
    public GreetingModel addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
        return greetingRepository.save(new GreetingModel(counter.incrementAndGet(), message));
    }

    @Override
    public GreetingModel getGreetingById(long id) {

        return greetingRepository.findById(id).get();
    }

    @Override
    public String deleteMessageById(long id) {
        greetingRepository.deleteById(id);
        return "Data has been deleted";
    }

    @Override
    public GreetingModel editGreeting(GreetingModel greeting) {

        return greetingRepository.save(new GreetingModel(2, "Updated Successful"));
    }

    @Override
    public List<GreetingModel> getAllGreetings() {
        return greetingRepository.findAll();
    }
}
