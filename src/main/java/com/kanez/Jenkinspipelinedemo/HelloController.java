package com.kanez.Jenkinspipelinedemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        Long id1 = 1L;
        Long id2 = 1L;

        if (id1 == id2){
            System.out.println("id1 equals id2.");
        }

        return "Greetings from Spring Boot!";
    }
}