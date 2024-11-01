package com.example.learn_sping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Khai báo đây là controller
public class HelloWorldController {
    @GetMapping("/") //Khai báo endpoint
    public String helloWorld() {
        return "Hello World";
    }
}
