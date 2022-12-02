package com.lucaticket.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * Application
 * @author Martin
 * Servidor Eureka para el proyecto LucaTicket
 * @version 1.0
 * 02-12-2022
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
