package com.lucaticket.eventos;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lucaticket.eventos.adapter.EventoAdapter;
import com.lucaticket.eventos.controller.EventoController;
import com.lucaticket.eventos.dto.EventoDTO;
import com.lucaticket.eventos.model.Evento;
import com.lucaticket.eventos.repository.EventoRepository;



@SpringBootTest
class LucaTicketEventosApplicationTests {

	@Autowired
	private EventoRepository repository;
	@Autowired
	private EventoAdapter adapter;
	@Autowired
	private EventoController controller;
	
	
	
	/**
	 * LucaTicketEventosApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 05-12-2022
	 */
	
	@Test
	void testAltaEventoExiste() {
		List<Evento> eventos = repository.findAll();
		eventos.add(new Evento("2","pepe", "senior mayor","un senior muy mayor",
				"C:\\Desktop",20,300,"No molestar a la gente", "Pepeland",
				"Madrid","Avenida Pepelandia", "demasiado grande", 6000));
		
		List<EventoDTO> edto = adapter.convertToDTO(eventos);
		
		for(EventoDTO events : edto) {
			if(events.getId() == "2") {
				assertThat(edto).isNotNull();
			}
		}
		
	}
	
	

	/**
	 * LucaTicketEventosApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 06-12-2022
	 */

	@Test
	void testEventoAltaSuNombre() {
		List<Evento> eventos = repository.findAll();
		Evento e = new Evento("2","paco", "ninio pequenio","un ninio muy pequenio",
				"C:\\Documents",20,300,"Molestar a la gente", "Nanoland",
				"Madrid","Avenida Nanolandia", "demasiado pequenio", 2000);
		eventos.add(e);
		controller.save(e);
		
		assertThat(e.getNombre()).isEqualTo("paco");
	}
	
	
	
	
	/**
	 * LucaTicketEventosApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 06-12-2022
	 */
	
	@Test
	void testCantidadEventos() {
		long antes = repository.count();
		repository.save(new Evento());
		long despues = repository.count();
		
		assertEquals(antes+1, despues);		
	}
	
	/**
	 * LucaTicketEventosApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 06-12-2022
	 */
	@Test
	void testListaNoVacia() {
		List<Evento> eventos = repository.findAll();
		
		assertThat(eventos).isNotNull();
	}
	
	/**
	 * LucaTicketEventosApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 06-12-2022
	 */
	@Test
	void testEventosListaNoVacia() {
		List<Evento> eventos = repository.findAll();
		
		for(Evento e : eventos) {
			assertThat(e).isNotNull();
		}
	}
	
	/**
	 * LucaTicketEventosApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 06-12-2022
	 */
	@Test
	void testEventoCreadoEsteEnLista() {
		Evento e = new Evento();
		controller.save(e);
		List<Evento> eventos = repository.findAll();
		List<EventoDTO> esDto = adapter.convertToDTO(eventos);
		EventoDTO eventdto = adapter.convertToDTO(e);
		
		assertThat(esDto).contains(eventdto);
	}
	

}
