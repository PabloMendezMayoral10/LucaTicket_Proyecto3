package com.lucaticket.usuarios.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaticket.usuarios.adapter.UsuarioAdapter;
import com.lucaticket.usuarios.dto.UsuarioDTO;
import com.lucaticket.usuarios.model.Usuario;
import com.lucaticket.usuarios.repository.UsuarioRepository;

@Transactional
@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository ur;
	
	public void save(Usuario u) {
		
		UsuarioAdapter ua = new UsuarioAdapter();
		
		save(ua.of(u));
		
	}
}
