package com.example.TravelApp.controller;

import com.example.TravelApp.entities.user.User;
import com.example.TravelApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public String createUser(@RequestBody User user) {
        boolean isInserted = userService.insertUser(user);
        return isInserted ? "User created successfully" : "Email or Username already exists";
    }

}
