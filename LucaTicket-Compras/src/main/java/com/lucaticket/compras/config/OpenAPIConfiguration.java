package com.lucaticket.compras.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * 
 * @author Pedro Pusso
 * @since 06/12/2022
 *
 */


@Configuration
public class OpenAPIConfiguration {
	
	/**
	 * 
	 * @return Se encarga de poner la información especifica de la API
	 * 
	 */

	@Bean
	public OpenAPI CompraOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("API")
				.description("Documentacion de Compras API")		
				.version("v1.0")
				.contact(new Contact().name("Proyecto3").
						url("https://proyecto3.es").email("proyecto3@final.es"))
				.license(new License().name("Licencia de Pago").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation()
				.description("Descripcion del proyecto Compras")
				.url("https://nuestroproyecto3.es"));
						
	}

}