package com.elildes.vendas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class HelloControllerTests {
	@GetMapping("/test")
	public String HelloWordl() {
		return "Hello world tests!!";
	}
}
