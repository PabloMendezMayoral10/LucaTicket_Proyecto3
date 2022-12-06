package com.lucaticket.eventos;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
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
	
	//Comprobar que después de hacer el alta el evento existe
	
	/**
	 * LucaTicketEventossApplicationTests
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
		List<EventoDTO> evdto = adapter.convertToDTO(eventos);
		
		assertThat(evdto).isEqualTo(e.getNombre());
	}
	
	
	
	
	/**
	 * LucaTicketEventosApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 06-12-2022
	 */
	
	@Test
	void testCantidadEventos() {
		
		Evento e = new Evento("3","paqui", "ninia pequenia","una ninia muy pequenia",
				"C:\\Downloads",30,400,"ser obediente", "PaquiLandia",
				"A corunia","Plaza Castilla", "demasiado bajita", 3000);
	
		long antes = repository.count();
		controller.save(e);
		long despues = repository.count();
		
		assertEquals(antes+1, despues);
		
		
	}
	
	
	
	

}
