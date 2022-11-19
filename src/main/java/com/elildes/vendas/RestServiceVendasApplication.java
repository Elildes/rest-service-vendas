package com.elildes.vendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elildes.vendas.controller.HelloController;

@SpringBootApplication
public class RestServiceVendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceVendasApplication.class, args);
	}

}
