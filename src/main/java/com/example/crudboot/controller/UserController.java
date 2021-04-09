package com.example.crudboot.controller;

import com.example.crudboot.domain.User;
import com.example.crudboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users/{id}")
    User getUser(@PathVariable(name = "id") Long id){
        return userService.getUser(id);
    }
}
