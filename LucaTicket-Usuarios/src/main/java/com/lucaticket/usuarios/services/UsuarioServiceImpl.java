package com.lucaticket.usuarios.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lucaticket.usuarios.model.Usuario;
import com.lucaticket.usuarios.repository.UsuarioRepository;

public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
}
