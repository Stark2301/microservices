package com.jwt.example.JwtExample3.controller;

import com.jwt.example.JwtExample3.dto.AuthRequest;
import com.jwt.example.JwtExample3.model.User;
import com.jwt.example.JwtExample3.service.UserService;
import com.jwt.example.JwtExample3.util.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtHelper jwtHelper;

    @GetMapping("/users")
    public List<User> getUser(){
       return  userService.getUserList();
    }

//    @PostMapping("/login")
//    public String getAuthenticate(@RequestBody AuthRequest authRequest){
//           return jwtHelper.generateToken(authRequest.getUsername());
//    }
}