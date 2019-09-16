package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hi")
public class Hellocontroller {
	@GetMapping(value="/hello")
public String Hello() {
	return "hi";
}
}
