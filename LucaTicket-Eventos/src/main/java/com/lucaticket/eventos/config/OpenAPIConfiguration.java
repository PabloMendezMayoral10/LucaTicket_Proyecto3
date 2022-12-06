package com.lucaticket.eventos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfiguration {

	
	@Bean
	public OpenAPI EventoOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("EventosAPI")
				.description("Documentacion de Eventos API")		
				.version("v1.0")
				.contact(new Contact().name("Proyecto3").
						url("https://proyecto3.es").email("proyecto3@final.es"))
				.license(new License().name("Licencia de Pago").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation()
				.description("Descripcion del proyecto Eventos")
				.url("https://nuestroproyecto3.es"));
						
	}
	
}
