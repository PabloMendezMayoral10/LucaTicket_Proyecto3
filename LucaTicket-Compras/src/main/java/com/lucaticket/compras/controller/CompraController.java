package com.lucaticket.compras.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lucaticket.compras.controller.mensajes.NoValidadoException;
import com.lucaticket.compras.dto.CompraDTO;
import com.lucaticket.compras.service.CompraService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.net.URI;

import org.slf4j.Logger;

@RestController
@RequestMapping("/compras")
@Tag(name = "Compra", description = "Compra API")

/**
 * 
 * @author Pedro Pusso Muro
 * @since 07/12/2022
 *
 */

public class CompraController {
	//private static final Logger log = LoggerFactory.getLogger(CompraController.class);
	
	@Autowired
	private CompraService cs;

	
	@Operation(summary = "Realiza una compra", description = "Compra un ticket para un usuario de un evento", tags = {"compra"})
	@ApiResponses(value = {
		@ApiResponse(responseCode = "201", description = "Compra realizada", content = {
				@Content(mediaType = "application/json", schema = @Schema(implementation = CompraDTO.class))
		}),
		@ApiResponse(responseCode = "400", description = "No válido", content = @Content)
	})

	@PostMapping("/{idUsu}/comprar")
	public CompraDTO realizarCompra(@PathVariable int idUsu, @RequestParam String idEve) throws NoValidadoException{
		//CompraDTO compra=null;
		//compra = cs.realizarCompra(idUsu, idEve);
		//URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(compra.getId_compra()).toUri();
		//return ResponseEntity.created(location).build();
		
		CompraDTO compra = cs.realizarCompra(idUsu, idEve);
		
		return compra;
	}

}
