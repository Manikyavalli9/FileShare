package com.example.fileshare.Controller;

import com.example.fileshare.model.user;
import com.example.fileshare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    //auto linking to user service class
    @Autowired
    public UserService userService;
//post mapping for registering users.....
    @PostMapping("/register")
    public void register(@RequestBody User user) {
        userService.register(user);
    }
}
