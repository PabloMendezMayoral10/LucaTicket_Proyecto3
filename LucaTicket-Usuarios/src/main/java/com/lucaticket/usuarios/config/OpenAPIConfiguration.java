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
 * @author Ioan Stirbu
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
	public OpenAPI UsuarioOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("UsuariosAPI")
				.description("Documentacion de Usuarios API")		
				.version("v1.0")
				.contact(new Contact().name("Proyecto3").
						url("https://proyecto3.es").email("proyecto3@final.es"))
				.license(new License().name("Licencia de Pago").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation()
				.description("Descripcion del proyecto Usuarios")
				.url("https://nuestroproyecto3.es"));
						
	}

}