package com.lucaticket.compras.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.lucaticket.compras.dto.EventoDTO;

/**
 * 
 * @author Álvaro Blanco
 * @apiNote Esta clase permite conectar microservicio eventos
 */
@FeignClient(name = "crud-eventos", url = "http://localhost:8888")
public interface ComprasFeingEventos {

	@GetMapping("/eventos/{id}")
	public EventoDTO getEventById(String id);
}
