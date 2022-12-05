package com.lucaticket.eventos.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lucaticket.eventos.dto.EventoDTO;
import com.lucaticket.eventos.model.Evento;
import com.lucaticket.eventos.service.EventoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping("/eventos")
@Tag(name = "evento", description = "API de eventos")
public class EventoController {
	@Autowired
	private EventoService service;
	
	@Operation(summary = "Buscar eventos por ID", description = "Dado un ID, devuelve un objeto Evento transformado en DTO", tags= {"student"})
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Eventos localizados", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = EventoDTO.class)) }),
			@ApiResponse(responseCode = "204", description = "No hay eventos", content = @Content),
			@ApiResponse(responseCode = "400", description = "Peticion no válida", content = @Content)})
	@GetMapping()
	public ResponseEntity<List<EventoDTO>> findAll(){
		List<EventoDTO> lista = service.findAll();
		if(lista.isEmpty()) return  ResponseEntity.noContent().build();
		return ResponseEntity.ok(service.findAll());
	}
	
	@Operation(summary = "Buscar estudiantes por ID", description = "Dado un ID, devuelve un objeto Student", tags= {"student"})
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Evento Creado", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = EventoDTO.class)) }),
			@ApiResponse(responseCode = "400", description = "", content = @Content)})
	@PostMapping()
	public ResponseEntity<EventoDTO> save( Evento evento ) {
		EventoDTO respuesta = service.save(evento);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(respuesta.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
}
