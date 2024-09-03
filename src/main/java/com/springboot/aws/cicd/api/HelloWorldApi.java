package com.springboot.aws.cicd.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApi {
    @GetMapping
    public String helloWord(){
        return "Awesome ...Welcome to Spring Boot AWS with CI CD...!";
    }
}
