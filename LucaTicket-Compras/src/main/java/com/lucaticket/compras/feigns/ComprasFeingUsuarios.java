package com.lucaticket.compras.feigns;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lucaticket.compras.dto.UsuarioDTO;

/**
 * 
 * @author Álvaro Blanco
 * @apiNote Esta clase permite conectar microservicio usuarios
 *
 */
@FeignClient(name = "crud-usuarios", url = "http://localhost:9999")
public interface ComprasFeingUsuarios {

	@GetMapping("/usuarios/{id}")
	public UsuarioDTO getUsuarioById(@PathVariable int id);
}
