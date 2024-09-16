package com.example.emazontransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // Habilita Feign
public class EmazontransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmazontransactionApplication.class, args);
	}
}
