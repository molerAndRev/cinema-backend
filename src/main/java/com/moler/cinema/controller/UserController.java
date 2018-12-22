package com.moler.cinema.controller;

import com.moler.cinema.Service.UserService;
import com.moler.cinema.requests.UserRegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("")
    public ResponseEntity register(@RequestBody UserRegisterRequest request) {
        userService.register(request);
        return new ResponseEntity(HttpStatus.OK);
    }
}
