package com.ocptest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMe {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
