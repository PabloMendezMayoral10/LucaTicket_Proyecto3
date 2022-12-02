package com.lucaticket.LucaTicketGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LucaTicketGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LucaTicketGatewayApplication.class, args);
	}

}
