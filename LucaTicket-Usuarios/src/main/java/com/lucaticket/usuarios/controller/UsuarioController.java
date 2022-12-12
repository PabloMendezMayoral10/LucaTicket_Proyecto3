package com.lucaticket.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lucaticket.usuarios.controller.mensajes.UsuarioNotFoundException;
import com.lucaticket.usuarios.dto.UsuarioDTO;
import com.lucaticket.usuarios.model.Usuario;
import com.lucaticket.usuarios.service.UsuarioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

//import io.swagger.v3.oas.annotations.tags.Tag;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Validated
@RestController
@RequestMapping("/usuarios")
@Tag(name = "Usuario", description = "Usuario API")

/**
 * @author Álvaro Blanco
 * @apiNote Clase UsuarioController que se encarga de controlar las respuestas
 *          REST con sus respectivos métodos
 */
public class UsuarioController {
	private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);
	@Autowired
	private UsuarioService service;
	

	@Operation(summary = "Insertar un nuevo usuario", description = "Inserta y devuelve el usuario que se ha añadido previamente", tags = {
	"usuario" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "201", description = "Insertar usuario", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = UsuarioDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })

	@PostMapping("")
	public UsuarioDTO save(@Valid @RequestBody Usuario usu) {
		log.info("--- save an user ---");
		//UsuarioDTO resultado = this.service.save(usu);
		//URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(resultado.getId()).toUri();
		//return ResponseEntity.created(location).build();
		
		// Actualizado pare enviar un mensaje 201:
		UsuarioDTO res = service.save(usu);
		
		return res;
	}
	
	@Operation(summary = "Listar todos los usuarios", description = "Devuelve el resultado de ejecucion de la lista de usuarios", tags = {
	"usuario" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Usuarios mostrados", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = UsuarioDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido", content = @Content) })
	
	@GetMapping()
	public List<UsuarioDTO> findAll(){
		List<UsuarioDTO> lista = service.findAll();
		Optional<List<UsuarioDTO>> optLista = Optional.ofNullable(lista);
		if(lista.isEmpty()) optLista  = Optional.empty();
		//if(optLista.isEmpty()) throw new ListaVaciaException();
		return  optLista.orElseThrow(ListaVaciaException::new) ;
	}
	
	@Operation(summary = "Detalle de usuario buscado por ID", description = "Devuelve el resultado de buscar un usuario", tags = {
	"usuario" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Usuario mostrado", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = UsuarioDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido", content = @Content),
	@ApiResponse(responseCode = "404", description = "No encontrado", content = @Content)})
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable int id) throws UsuarioNotFoundException {
		UsuarioDTO dto = service.findById(id);
		if(dto==null) throw new UsuarioNotFoundException(id);
		return ResponseEntity.ok( service.findById(id) );
	}
}
