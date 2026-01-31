package com.nafiul.cybergame.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/")  // ← এখানে root mapping add করো (পুরো class root এ map হবে)
@CrossOrigin(origins = "http://localhost:5174")
public class TestController {

    @GetMapping("/")  // root path '/'
    public String home() {
        return "Welcome to CyberSecurity Awareness Game Backend! 🚀\n" +
               "API endpoints:\n" +
               "- /api/hello → Test message\n" +
               "- Frontend connect করো: http://localhost:5173";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from Spring Boot backend! Cyber game ready.";
    }
}