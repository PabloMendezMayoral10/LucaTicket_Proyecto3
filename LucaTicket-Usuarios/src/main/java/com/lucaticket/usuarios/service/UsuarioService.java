package com.lucaticket.usuarios.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaticket.usuarios.adapter.UsuarioAdapter;
import com.lucaticket.usuarios.model.Usuario;
import com.lucaticket.usuarios.repository.UsuarioRepository;
import com.lucaticket.usuarios.response.UsuarioResponse;
/**
 * 
 * @author Pedro
 * @author Álvaro Blanco
 * @apiNote
 *
 */
@Transactional
@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;
	@Autowired
	private UsuarioAdapter adapter;
	
//	public UsuarioDTO save(Usuario u) {
//		
//		UsuarioAdapter ua = new UsuarioAdapter();
//		
//		return ur.save(ua.of(u));
//		
//	}
	
	public UsuarioResponse save(Usuario u) {
		final Usuario usuario = repository.save(u);
		return adapter.of(usuario);
	}
}
