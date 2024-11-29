package com.example.gestor_de_vagas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class GestorDeVagasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestorDeVagasApplication.class, args);
	}

}
