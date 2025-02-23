package com.springgreetingapp.greetingapp.repository;

import com.springgreetingapp.greetingapp.model.Greeting;

import org.springframework.data.jpa.repository.JpaRepository;


public interface GreetingRepository extends JpaRepository<Greeting, Long> {}
