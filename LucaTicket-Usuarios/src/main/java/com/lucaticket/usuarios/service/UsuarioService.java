package com.lucaticket.usuarios.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lucaticket.usuarios.dto.UsuarioDTO;
import com.lucaticket.usuarios.model.Usuario;

@Service
public interface UsuarioService {
	public UsuarioDTO save(Usuario u);
	public List<UsuarioDTO> findAll();
}
