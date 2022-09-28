package com.example.greetingcontroller1.repository;

import com.example.greetingcontroller1.model.GreetingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<GreetingModel, Long> {
}
