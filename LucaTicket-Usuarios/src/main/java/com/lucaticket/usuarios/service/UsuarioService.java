package com.lucaticket.usuarios.service;

import java.util.List;

import com.lucaticket.usuarios.dto.UsuarioDTO;
import com.lucaticket.usuarios.model.Usuario;

public interface UsuarioService {
	public UsuarioDTO save(Usuario u);
	public List<UsuarioDTO> findAll();
}
