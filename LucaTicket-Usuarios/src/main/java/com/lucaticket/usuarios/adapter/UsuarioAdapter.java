package com.lucaticket.usuarios.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.lucaticket.usuarios.model.Usuario;
import com.lucaticket.usuarios.response.UsuarioResponse;

/**
 * 
 * @author Ioan Stirbu
 * @version 1.0
 * @apiNote Esta clase se encarga de convertir un Usuario en UsuarioResponse que trabaja de DTO   
 * y no UsuarioDTO
 *
 */

@Component
public class UsuarioAdapter {

	/**
	 * @author Ioan Stirbu
	 * @param u
	 * @return Devuelve el usuario transformado en DTO
	 */

	public UsuarioResponse of(Usuario u) {
		UsuarioResponse dto = new UsuarioResponse();

		dto.setUsername(u.getUsername());
		dto.setPassword(u.getPassword());
		dto.setEmail(u.getEmail());

		return dto;
	}

	/**
	 * @author Ioan Stirbu
	 * @param usuarios
	 * @return Devuelve una lista de UsuarioDTO a partir de una lista de usuarios
	 */

	public List<UsuarioResponse> of(List<Usuario> usuarios) {
		ArrayList<UsuarioResponse> todos = new ArrayList<UsuarioResponse>();

		for (Usuario u : usuarios) {
			todos.add(of(u));
		}
		return todos;
	}

}
