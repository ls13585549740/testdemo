package com.example.demo.controller;

import java.util.Locale;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	  @RequestMapping("/hello")
		public String hello(Locale locale, Model model) {
			return "Hello World 2019.8.14";
		}
}
