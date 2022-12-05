package com.lucaticket.usuarios;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lucaticket.usuarios.model.Usuario;
import com.lucaticket.usuarios.adapter.UsuarioAdapter;
import com.lucaticket.usuarios.dto.UsuarioDTO;
import com.lucaticket.usuarios.repository.UsuarioRepository;

/**
 * LucaTicketUsuariosApplicationTests
 * @author martin
 * Pruebas unitarias para el microservicio Usuarios
 * @version 1.0
 * 02-12-2022
 */
@SpringBootTest
class LucaTicketUsuariosApplicationTests {
	@Autowired
	private UsuarioRepository repo;
	
	@Autowired
	private UsuarioAdapter adapter;

	@Test
	void testAltaCantidadAumenta() { //TODO
		long antes = repo.count();
		repo.save(new Usuario ()); //MAS ADELANTE HABRA QUE HACERLO CON CONTROL
		long despues = repo.count();
		assertEquals(antes+1, despues);
	}
	
	/**
	 * LucaTicketUsuariosApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 05-12-2022
	 */
	
	
	@Test
	void testUsuarioAltaExiste() {
		//UsuarioDTO u = new UsuarioDTO();
		List<Usuario> usuarios = repo.findAll();
		usuarios.add(new Usuario(2,"pepep", "12345", "hola@gmail"));
		
		List<UsuarioDTO> usdto = adapter.of(usuarios);
		
		for(UsuarioDTO users : usdto) {
			if(users.getId() == 2) {
				assertThat(users).isNotNull();
			}
		}
		
		
	}

}
