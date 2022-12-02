package com.lucaticket.usuarios.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.lucaticket.usuarios.model.Usuario;

/**
 * 
 * @author Ioan Stirbu
 * @version 1.0
 * @apiNote Esta clase se encarga de convertir un Usuario en UsuarioDTO
 *
 */

@Component
public class UsuarioAdapter {

	/**
	 * @author Ioan Stirbu
	 * @param u
	 * @return Devuelve el usuario transformado en DTO
	 */

	public UsuarioDTO of(Usuario u) {
		UsuarioDTO dto = new UsuarioDTO();

		dto.setUsername(u.getUsername());
		dto.setPassword(u.getPassword());
		dto.setVideojuegos(u.getVideojuegos());

		return dto;
	}

	/**
	 * @author Ioan Stirbu
	 * @param usuarios
	 * @return Devuelve una lista de UsuarioDTO a partir de una lista de usuarios
	 */

	public List<UsuarioDTO> of(List<Usuario> usuarios) {
		ArrayList<UsuarioDTO> todos = new ArrayList<UsuarioDTO>();

		for (Usuario u : usuarios) {
			todos.add(of(u));
		}
		return todos;
	}

}
