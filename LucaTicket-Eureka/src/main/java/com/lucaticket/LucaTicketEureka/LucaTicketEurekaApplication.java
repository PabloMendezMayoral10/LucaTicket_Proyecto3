package com.lucaticket.LucaTicketEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LucaTicketEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LucaTicketEurekaApplication.class, args);
	}

}
