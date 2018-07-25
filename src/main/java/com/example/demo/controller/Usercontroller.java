package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {

    @GetMapping
    public String hello(){
        return " hello people ";
    }

    @PostMapping
    public void hey(){
        new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
