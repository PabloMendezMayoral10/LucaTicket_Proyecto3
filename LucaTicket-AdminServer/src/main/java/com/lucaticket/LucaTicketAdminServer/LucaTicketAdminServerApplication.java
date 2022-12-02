package com.lucaticket.LucaTicketAdminServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class LucaTicketAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LucaTicketAdminServerApplication.class, args);
	}

}
