package com.example.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String home(){
        return "<h1>Home page</h1>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h1>Admin page</h1>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h1>User page</h1>";
    }

}
