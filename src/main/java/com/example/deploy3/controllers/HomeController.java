package com.example.deploy3.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${devName}")
    private String devName;

    @Value("${authCode}")
    private String authCode;

    @GetMapping("/greeting")
    public String getProperty() {
        return "Hi " + devName + " " + authCode;
    }

}
