package com.green.boardtest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService SERVICE;

    @Autowired
    public UserController(UserService SERVICE) {
        this.SERVICE = SERVICE;
    }
}
