package com.lucaticket.eventos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LucaTicketEventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LucaTicketEventosApplication.class, args);
	}

}
