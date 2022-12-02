package com.lucaticket.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lucaticket.response.UsuarioResponse;
import com.lucaticket.usuarios.model.Usuario;
import com.lucaticket.usuarios.service.UsuarioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/usuario")
/**
 * 
 * @author Álvaro Blanco
 * @apiNote
 */
public class UsuarioController {
	private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);
	@Autowired
	private UsuarioService service;

	/**
	 * 
	 * @param Álvaro Blanco
	 * @return guarda un nuevo usuario
	 */
	@PostMapping("/guardar")
	public ResponseEntity<?> save(@RequestBody Usuario usuario) {
		log.info("--- save an usuario ---");
		UsuarioResponse resultado = this.service.save(usuario);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(resultado.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

}
