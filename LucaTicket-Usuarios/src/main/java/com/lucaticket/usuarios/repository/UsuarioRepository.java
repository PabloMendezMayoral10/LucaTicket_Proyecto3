package com.lucaticket.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucaticket.usuarios.dto.UsuarioDTO;
import com.lucaticket.usuarios.model.Usuario;

/**
 * UsuarioRepository
 * @author Martin
 * Interfaz para conectar con la base de datos de usuarios
 * @version 1.0
 * 02-12-2022
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
}
