package com.lucaticket.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucaticket.usuarios.model.Usuario;

/**
 * UsuarioRepository
 * @author Martin
 * Interfaz para conectar con la base de datos de usuarios
 * @version 1.0
 * 02-12-2022
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
}
