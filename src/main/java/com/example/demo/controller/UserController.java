package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String listStudents(Model model) {
        List<Users> users = userService.findAll();
        model.addAttribute("users", users);
        return "students";
    }
}
