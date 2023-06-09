package com.green.boardtest.user;

import com.green.boardtest.user.model.UserInsDto;
import com.green.boardtest.user.model.UserLoginDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService SERVICE;

    @Autowired
    public UserController(UserService SERVICE) {
        this.SERVICE = SERVICE;
    }

    @PostMapping
    @Operation(summary = "회원가입", description = "")
    public int postUser(@RequestBody UserInsDto dto) {
        return SERVICE.insUser(dto);
    }

    @PostMapping("/login")
    @Operation(summary = "로그인", description = "" +
    "리턴값 : <br>" +
    "(1) 로그인 성공 <br>" +
            "(2) 아이디 없음 <br>" +
            "(3) 비밀번호 다름")
    public int postloginUser(@RequestBody UserLoginDto dto) {
        return SERVICE.login(dto);
    }
}
