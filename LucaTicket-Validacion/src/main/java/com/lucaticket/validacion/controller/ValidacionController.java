package com.lucaticket.validacion.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucaticket.validacion.dto.ValidacionDTO;
import com.lucaticket.validacion.service.ValidacionService;
import com.lucaticket.validacion.tools.Simuladores;

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
	
	@Operation(summary = "Validar los pagos", description = "Devuelve un mensaje diciendo que los pagos se validaron correctamente", tags = {
	"validarpago" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Validar pago", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ValidacionDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })
	@GetMapping()

	public String validarPago(int id_usuario, String id_evento) {
		
		int tarjetaCredito = Simuladores.randBetween(20, 40) ;
		int dineroDisponible = Simuladores.randBetween(100, 200) ;

		
	}
	
	
	/*
	 * public String validarPago(int id_usuario, String id_evento) {
		
		//Poner todos los metodos
		
		//Generar datos aleatorios
		//Condicionales
		
		
		return mensaje;
	}
	 */
	
	
	@Operation(summary = "Mensaje pago correcto", description = "Devuelve un mensaje diciendo que el pago se ha realizado correctamente", tags = {
	"mensajepagocorrecto" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Mensaje pago correcto", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ValidacionDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })
	@GetMapping()
	
	public String mensajeOk() {
		String mensaje = "¡El pago se ha realizado exitosamente!";
		return mensaje;
	}
	
	
	@Operation(summary = "Error Fondos insuficientes", description = "Devuelve un mensaje diciendo que no hay fondos suficientes", tags = {
	"errorfondosinsuficientes" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Error fondo insuficiente", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ValidacionDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })
	@GetMapping()
	
	public String mensajeFondosInsuficientes() {
		String mensaje = "Error, actualmente no tiene los fondos necesarios para realizar el pago.";
		return mensaje;
	}
	
	@Operation(summary = "Error tarjeta caducada", description = "Devuelve un mensaje diciendo que la tarjeta de crédito está caducada", tags = {
	"errortarjetacaducada" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Error tarjeta caducada", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ValidacionDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })
	@GetMapping()
	
	public String mensajeTarjetaCaducada() {
		String mensaje = "Error, actualmente su tarjeta de crédito esta caducada.";
		return mensaje;
	}
	

	@Operation(summary = "Mensaje Pin incorrecto", description = "Devuelve un mensaje diciendo que el pin es incorrecto", tags = {
	"mensajepinincorrecto" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Mensaje pin incorrecto", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ValidacionDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })
	@GetMapping()
	
	public String mensajePinIncorrecto() {
		String mensaje = "Lo sentimos, el pin que ha marcado es incorrecto, intente otro distinto";
		return mensaje;
	}
	
	@Operation(summary = "Mensaje error pago", description = "Devuelve un mensaje diciendo que ha ocurrido un error al realizar el pago", tags = {
	"mensajeerrorpago" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Mensaje error pago", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ValidacionDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })
	@GetMapping()
	
	public String mensajeErrorPago() {
		String mensaje = "Lo sentimos, ha ocurrido un error al realizar el pago.";
		return mensaje;
	}
	

}
