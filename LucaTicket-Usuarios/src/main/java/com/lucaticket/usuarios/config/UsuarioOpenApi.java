package com.lucaticket.usuarios.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * 
 * @author Álvaro Blanco
 *
 */
@Configuration
public class UsuarioOpenApi {

	/**
	 * 
	 * @return Devuelve toda la información específica de la API
	 */
	@Bean
	public OpenAPI UserOpenApi() {
		return new OpenAPI()
				.info(new Info().title("User API").description("Documentacion de usuario API").version("v1.0")
						.contact(new Contact().name("Grupo 2").url("https://lucaTicket.es").email("grupo2@lucaTic.es"))
						.license(new License().name("Licencia gratuita").url("http://springdoc.org")))
				.externalDocs(
						new ExternalDocumentation().description("Lista de usuarios").url("https://lucaticket.es"));
	}

}
