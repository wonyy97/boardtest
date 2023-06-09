package com.green.boardtest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper MAPPER;

    @Autowired
    public UserService(UserMapper MAPPER) {
        this.MAPPER = MAPPER;
    }
}
