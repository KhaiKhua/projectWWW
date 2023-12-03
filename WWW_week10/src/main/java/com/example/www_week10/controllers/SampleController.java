package com.example.www_week10.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class SampleController {
        @GetMapping
        public String hello(){
            return "hello world";
        }

}
