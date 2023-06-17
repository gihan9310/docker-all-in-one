package com.gihanz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class TestController {

    @GetMapping
    public String welcomeMsg(){
        return  "Welcome Docker";
    }

    @GetMapping("working")
    public String workingOrNot(){
        return  "Working as expected.";
    }
}
