package com.lucaticket.eventos.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

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

import com.lucaticket.eventos.controller.mensajes.EventoNotFoundException;
import com.lucaticket.eventos.dto.EventoDTO;
import com.lucaticket.eventos.model.Evento;
import com.lucaticket.eventos.service.EventoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
/*
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Schema;
*/
@RestController
@Validated
@RequestMapping("/eventos")
@Tag(name = "Evento", description = "Eventos API")

public class EventoController {
	@Autowired
	private EventoService service;
	
	@Operation(summary = "Listar todos los eventos", description = "Devuelve el resultado de ejecucion de la lista de eventos", tags = {
	"evento" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Eventos mostrados", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = EventoDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })
	@GetMapping()
	public ResponseEntity<List<EventoDTO>> findAll(){
		List<EventoDTO> lista = service.findAll();
		if(lista.isEmpty()) return  ResponseEntity.noContent().build();
		return ResponseEntity.ok(lista);
	}
	

	@Operation(summary = "Insertar un nuevo evento", description = "Inserta y devuelve el evento que se ha añadido previamente", tags = {
	"evento" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Insertar evento", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = EventoDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })
	@PostMapping
	public EventoDTO save(@Valid @RequestBody Evento evento ) {
		//EventoDTO resultado = this.service.save(evento);
		//URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(resultado.getId()).toUri();
		//return ResponseEntity.created(location).build();
		
		EventoDTO res = service.save(evento);
		
		return res;
	}

	@Operation(summary = "Buscar un evento por id", description = "Devuelve un evento por el id solicitado", tags = {
	"evento" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Buscar evento por id", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = EventoDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })
	@GetMapping("/{evento}")
	public EventoDTO findById(@Valid @PathVariable String evento) throws EventoNotFoundException{
		
		return service.findById(evento);
	}
}
