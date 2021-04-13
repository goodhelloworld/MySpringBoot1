package com.my.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestInput {

    @PostMapping("/aaa")
    public String showTest(){
        return "a";
    }
}
