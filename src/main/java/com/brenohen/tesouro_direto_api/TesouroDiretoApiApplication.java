package com.brenohen.tesouro_direto_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.brenohen.tesouro_direto_api.controller", "com.brenohen.tesouro_direto_api.utilities"})
public class TesouroDiretoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesouroDiretoApiApplication.class, args);
	}
}
