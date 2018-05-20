package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LearnController {
//    private final
    @Autowired
    UserService userService;

    @GetMapping("/test")
    public User test() {
        return userService.getUser(1);

    }
}
