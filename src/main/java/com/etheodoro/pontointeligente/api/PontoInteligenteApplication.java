package com.etheodoro.pontointeligente.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PontoInteligenteApplication {

	public static void main(String[] args) {
		System.out.println("PontoInteligente");
		SpringApplication.run(PontoInteligenteApplication.class, args);
	}

}
