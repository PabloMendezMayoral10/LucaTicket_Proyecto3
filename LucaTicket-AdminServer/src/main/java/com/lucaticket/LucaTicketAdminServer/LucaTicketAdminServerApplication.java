package com.lucaticket.LucaTicketAdminServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * @author Pedro Pusso Muro
 * @version 1.0
 * @since 02/12/2022
 * Nombre: LucaTicketAdminServerApplication
 * Descripción:
 */

@EnableAdminServer
@SpringBootApplication
public class LucaTicketAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LucaTicketAdminServerApplication.class, args);
	}

}
