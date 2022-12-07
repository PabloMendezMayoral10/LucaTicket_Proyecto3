package com.lucaticket.validacion.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucaticket.validacion.dto.ValidacionDTO;
import com.lucaticket.validacion.service.ValidacionService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/validaciones")
public class ValidacionController {

	@Autowired
	private ValidacionService service;
	
	@Operation(summary = "Listar todos los eventos", description = "Devuelve el resultado de ejecucion de la lista de eventos", tags = {
	"evento" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Eventos mostrados", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ValidacionDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })
	@GetMapping()

	public String validarPago() {
		String mensaje = "Hola Validado correctamente";
		return mensaje;
	}
	
	

}
