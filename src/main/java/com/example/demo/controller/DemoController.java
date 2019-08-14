package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello(Locale locale, Model model) {
        return "Hello World 2019.8.14 021";
    }

}
