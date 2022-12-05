package com.lucaticket.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lucaticket.usuarios.dto.UsuarioDTO;
import com.lucaticket.usuarios.model.Usuario;
import com.lucaticket.usuarios.service.UsuarioService;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.net.URI;

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
		UsuarioDTO resultado = this.service.save(usuario);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(resultado.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}
	
	
	/**
	 * debo documentar openapi y no tengo la menor idea
	 */
}
