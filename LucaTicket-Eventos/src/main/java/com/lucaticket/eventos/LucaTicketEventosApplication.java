package com.lucaticket.eventos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 
 * @author Martin
 * @version 1.0
 * 02-12-2022
 * Main del microservicio de eventos
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LucaTicketEventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LucaTicketEventosApplication.class, args);
	}

}
