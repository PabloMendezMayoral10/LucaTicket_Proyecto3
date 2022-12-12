package com.lucaticket.validacion.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucaticket.validacion.dto.ValidacionDTO;
import com.lucaticket.validacion.model.MensajeJSON;
import com.lucaticket.validacion.tools.Simuladores;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/validaciones")
public class ValidacionController {
	
	@Operation(summary = "Validar los pagos", description = "Devuelve un mensaje diciendo que los pagos se validaron correctamente", tags = {
	"validarpago" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Validar pago", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ValidacionDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })
	@GetMapping()

	public MensajeJSON validarPago() {
		int metodo = Simuladores.randBetween(1, 5);
		
		switch(metodo) {
			case 1: 
				return mensajeOk();
			case 2:
				return mensajePinIncorrecto();
			case 3:
				return mensajeTarjetaCaducada();
			case 4:
				return mensajeFondosInsuficientes();
			case 5:
				return mensajeErrorCodigo();
			default:
				return new MensajeJSON(-1, "Se ha liado tanto que no hay ni mensaje de error");
		}
	}
	
	@Operation(summary = "Mensaje pago correcto", description = "Devuelve un mensaje diciendo que el pago se ha realizado correctamente", tags = {
	"mensajepagocorrecto" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Mensaje pago correcto", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ValidacionDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })

	
	public MensajeJSON mensajeOk() {
		MensajeJSON mensaje = new MensajeJSON(100, "¡El pago se ha realizado exitosamente!");
		return mensaje;
	}
	
	
	@Operation(summary = "Error Fondos insuficientes", description = "Devuelve un mensaje diciendo que no hay fondos suficientes", tags = {
	"errorfondosinsuficientes" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Error fondo insuficiente", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ValidacionDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })

	public MensajeJSON mensajeFondosInsuficientes() {
		MensajeJSON mensaje = new MensajeJSON(51, "Error, actualmente no tiene los fondos necesarios para realizar el pago.");
		return mensaje;
	}
	
	@Operation(summary = "Error tarjeta caducada", description = "Devuelve un mensaje diciendo que la tarjeta de crédito está caducada", tags = {
	"errortarjetacaducada" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Error tarjeta caducada", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ValidacionDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })

	
	public MensajeJSON mensajeTarjetaCaducada() {
		MensajeJSON mensaje = new MensajeJSON(54, "Error, actualmente su tarjeta de crédito esta caducada.");
		return mensaje;
	}
	

	@Operation(summary = "Mensaje Pin incorrecto", description = "Devuelve un mensaje diciendo que el pin es incorrecto", tags = {
	"mensajepinincorrecto" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Mensaje pin incorrecto", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ValidacionDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })
	
	public MensajeJSON mensajePinIncorrecto() {
		MensajeJSON mensaje = new MensajeJSON(80, "Lo sentimos, el pin que ha marcado es incorrecto, intente otro distinto");
		return mensaje;
	}
	
	@Operation(summary = "Mensaje codigo incorrecto", description = "Devuelve un mensaje diciendo que ha ocurrido un error de codigo incorrecto", tags = {
	"Mensajecodigoincorrecto" })
@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Mensaje codigo incorrecto", content = {
			@Content(mediaType = "application/json", schema = @Schema(implementation = ValidacionDTO.class)) }),
	@ApiResponse(responseCode = "400", description = "No válido (NO implementado) ", content = @Content) })

	
	public MensajeJSON mensajeErrorCodigo() {
		MensajeJSON mensaje = new MensajeJSON(06, "Error, el codigo de seguridad es incorrecto.");
		return mensaje;
	}
	

}
