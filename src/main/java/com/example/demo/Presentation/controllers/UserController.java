package com.example.demo.Presentation.controllers;

import com.example.demo.Buisness.Services.interfaces.UserService;
import com.example.demo.Repository.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String test(){
        return "hello";
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User u){

        userService.addUser(u);
        return u;
    }

}
