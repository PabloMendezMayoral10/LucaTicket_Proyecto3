package com.lucaticket.usuarios;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lucaticket.usuarios.model.Usuario;
import com.lucaticket.usuarios.adapter.UsuarioAdapter;
import com.lucaticket.usuarios.controller.UsuarioController;
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
	
	@Autowired
	private UsuarioController controller;

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
		
		List<Usuario> usuarios = repo.findAll();

		usuarios.add(new Usuario(2, "Pablo", "Mendez", "12345", "hola@gmail"));

		
		List<UsuarioDTO> usdto = adapter.of(usuarios);
		
		for(UsuarioDTO users : usdto) {
			if(users.getId() == 2) {
				assertThat(users).isNotNull();
			}
		}
		
		
	}
	/**
	 * LucaTicketUsuariosApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 06-12-2022
	 */

	@Test
	void testUsuarioAltaSuNombre() {
		List<Usuario> usuarios = repo.findAll();
		Usuario u = new Usuario(3, "Ioan", "Stirbu", "12345", "adios@gmail");
		usuarios.add(u);
		controller.save(u);
		List<UsuarioDTO> usdto = adapter.of(usuarios);
		
		assertThat(u.getNombre()).isEqualTo("Ioan");
	}
	
	
	/**
	 * LucaTicketUsuariosApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 06-12-2022
	 */
	@Test
	void testListaNoVacia() {
		List<Usuario> usuarios = repo.findAll();
		
		assertThat(usuarios).isNotNull();
		
	}
	
	/**
	 * LucaTicketUsuariosApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 06-12-2022
	 */
	@Test
	void testUsuarioExistenteLista() {
		Usuario usuario = new Usuario();
		controller.save(usuario);
		
		List<Usuario> lista_usuarios = repo.findAll();
		List<UsuarioDTO> usudto = adapter.of(lista_usuarios);
		
		UsuarioDTO userdto = adapter.of(usuario);
		
		assertThat(usudto).contains(userdto);
		
		
	}
	
	/**
	 * LucaTicketUsuariosApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 06-12-2022
	 */
	
	void testUsuarioListaNoNulo() {
		List<Usuario> lista_usuarios = repo.findAll();
		
		for(Usuario us: lista_usuarios)
			assertThat(us).isNotNull();
	}
	
	/**
	 * @author Martin
	 * @version 1.0
	 * @since 07-12-2022
	 */
	@Test
	void testUsuarioNoFieldShouldBeNull() {
		
	}
	

}
