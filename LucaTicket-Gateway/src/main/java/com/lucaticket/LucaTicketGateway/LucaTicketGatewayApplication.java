package com.lucaticket.LucaTicketGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Pedro Pusso Muro
 * @version 1.0
 * Nombre: LucaTicketGatewayApplication
 * Fecha: 02/12/2022
 * Descripción:
 */

@EnableDiscoveryClient
@SpringBootApplication
public class LucaTicketGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LucaTicketGatewayApplication.class, args);
	}

}
