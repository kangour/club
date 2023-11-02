package com.example.subject.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 刷题 controller
 */
@RestController
public class SubjectController {
    @GetMapping("/test")
    public String subject(){
        return "Hello world";
    }
}
