package com.springboot.aws.cicd.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldApi {
    @GetMapping
    public String helloWord(){
        return "Om Namo Narayana";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String getFoos(@RequestParam String id) {
        return "Hello Mr." + id;
    }
}
