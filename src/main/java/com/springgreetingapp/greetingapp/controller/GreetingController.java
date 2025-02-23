package com.springgreetingapp.greetingapp.controller;

import com.springgreetingapp.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    // GET request - returns a greeting message
    @GetMapping("/hello")
    public String getGreeting() {
        return "{\"message\": \"Hello, World!\"}";
    }

    // POST request - accepts a name and returns a personalized greeting
    @PostMapping("/hello")
    public String createGreeting(@RequestParam String name) {
        return "{\"message\": \"Hello, " + name + "!\"}";
    }

    // PUT request - updates a greeting message (simulated)
    @PutMapping("/hello")
    public String updateGreeting(@RequestParam String newMessage) {
        return "{\"message\": \"Updated greeting: " + newMessage + "\"}";
    }

    // DELETE request - deletes a greeting message
    @DeleteMapping("/hello")
    public String deleteGreeting() {
        return "{\"message\": \"Greeting deleted successfully!\"}";
    }

    //
    @Autowired
    private GreetingService greetingService;

    @GetMapping("/message")
    public String getGreeting1() {
        return "{\"message\": \"" + greetingService.getGreetingMessage() + "\"}";
    }
}
