package com.lucaticket.usuarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lucaticket.usuarios.model.Usuario;
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

	@Test
	void testAltaCantidadAumenta() { //TODO
		long antes = repo.count();
		repo.save(new Usuario ()); //MAS ADELANTE HABRA QUE HACERLO CON CONTROL
		long despues = repo.count();
		assertEquals(antes+1, despues);
	}

}
