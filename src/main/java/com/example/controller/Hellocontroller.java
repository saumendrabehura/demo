package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hi")
public class Hellocontroller {
public String Hello() {
	return "hi";
}
}
