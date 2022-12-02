package com.lucaticket.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 
 * @author Ioan Stirbu
 * @version 1.0
 *  date: 02/12/2022
 *
 *	@apiNote Clase Main, que carga el Cliente Discovery
 *	y los feign clients que es una dependencia que se debe de poner en el pom.xml
 */


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LucaTicketUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LucaTicketUsuariosApplication.class, args);
	}

}
