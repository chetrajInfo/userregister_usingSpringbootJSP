package com.disaster.alert.recovery.disaster.apps.controller;


import com.disaster.alert.recovery.disaster.apps.entity.UserRegister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserRegisterController {


    @GetMapping
    public String showOpeningMessage(){
        return "First Page in Json Format Check this";
    }

    @PostMapping("/register")
    public ResponseEntity<UserRegister> registerUser(){
        return null;
    }
}
