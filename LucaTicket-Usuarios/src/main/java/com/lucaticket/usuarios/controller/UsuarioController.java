package com.lucaticket.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lucaticket.usuarios.model.Usuario;
import com.lucaticket.usuarios.response.UsuarioResponse;
import com.lucaticket.usuarios.service.UsuarioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.net.URI;
import java.net.URISyntaxException;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/usuario")
@Tag(name = "Usuario", description = "User API")
/**
 * @author Álvaro Blanco
 * @apiNote Clase UsuarioController que se encarga de controlar las respuestas
 *          REST con sus respectivos métodos
 */
public class UsuarioController {
	private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);
	@Autowired
	private UsuarioService service;

	/**
	 * @param Álvaro Blanco
	 * @return guarda un nuevo usuario
	 */

	@PostMapping("/guardar")
	public ResponseEntity<?> save(@RequestBody Usuario usuario) {
		log.info("--- save an user ---");
		UsuarioResponse resultado = this.service.save(usuario);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(resultado.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	/**
	 * Guarda un nuevo usuario desde API
	 */

	@Operation(summary = "Agregar nuevo usuario", description = "", tags = { "contact" })
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Usuario creado", content = @Content(schema = @Schema(implementation = Usuario.class))),
			@ApiResponse(responseCode = "400", description = "Invalid input"),
			@ApiResponse(responseCode = "409", description = "Este usuario ya existe") })
	@PostMapping(value = "/guardar", consumes = { "application/json", "application/xml" })
	public ResponseEntity<Usuario> addContact(
			@Parameter(description = "No se puede anular o vaciar.", required = true, schema = @Schema(implementation = Usuario.class)) @Valid @RequestBody Usuario usuario)
			throws URISyntaxException {
		// No tengo la menor idea qué debe devolver
		return null;
	}
	
	
	/**
	 * Documentar usuario con OpenApi
	 */

}
