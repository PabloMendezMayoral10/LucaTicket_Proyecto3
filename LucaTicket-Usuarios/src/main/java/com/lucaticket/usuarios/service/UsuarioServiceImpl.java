package com.lucaticket.usuarios.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaticket.usuarios.adapter.UsuarioAdapter;
import com.lucaticket.usuarios.dto.UsuarioDTO;
import com.lucaticket.usuarios.model.Usuario;
import com.lucaticket.usuarios.repository.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService{
	@Autowired
	private UsuarioRepository ur;
	
	@Override
	public UsuarioDTO save(Usuario u) {
		UsuarioAdapter ua = new UsuarioAdapter();
		return ua.of(ur.save(u));
	}
	
	/**
	 * @author Martin
	 * @return Lista de todos los usuarios
	 * 02-12-2022
	 */
	@Override
	public List<UsuarioDTO> findAll(){
		UsuarioAdapter ua = new UsuarioAdapter();
		return ua.of(ur.findAll());
	}
	
	/**
	 * @author Martin
	 * @param El ID del usuario a buscar
	 * @return El usuario en concreto, o null si no existe
	 * 02-12-2022
	 */
	@Override
	public UsuarioDTO findById(int id) {
		UsuarioAdapter ua = new UsuarioAdapter();
		Usuario u = ur.findById(id).orElse(null);
		if(u==null) return null;
		return ua.of(u);
	}
}
