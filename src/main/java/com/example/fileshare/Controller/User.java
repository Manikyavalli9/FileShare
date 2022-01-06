package com.example.fileshare.Controller;

import com.example.fileshare.model.user;
import com.example.fileshare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class User {
    //auto linking to user service class
    @Autowired
    public UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody User user) {
        userService.register(user);
    }
}
