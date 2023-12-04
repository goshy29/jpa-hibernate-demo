package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String getHome() {
        return "Hello from Home page in 25 Hibernate and SpringData! :))";
    }
}
