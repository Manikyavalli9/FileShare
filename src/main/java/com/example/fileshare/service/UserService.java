package com.example.fileshare.service;

import com.example.fileshare.Controller.User;
import com.example.fileshare.repository.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //auto linking to user repo
    @Autowired
    public Userrepo userrepo;

    public User register(User user) {
        return (User) userrepo.save(user);
    }
}
