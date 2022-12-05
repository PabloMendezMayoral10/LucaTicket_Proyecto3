package com.lucaticket.eventos;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lucaticket.eventos.adapter.EventoAdapter;
import com.lucaticket.eventos.dto.EventoDTO;
import com.lucaticket.eventos.model.Evento;
import com.lucaticket.eventos.repository.EventoRepository;



@SpringBootTest
class LucaTicketEventosApplicationTests {

	@Autowired
	private EventoRepository repository;
	@Autowired
	private EventoAdapter adapter;
	
	
	/**
	 * LucaTicketEventossApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 05-12-2022
	 */
	
	@Test
	void testAltaEventoExiste() {
		List<Evento> eventos = repository.findAll();
		eventos.add(new Evento(2,"pepe", "senior mayor","un senior muy mayor",
				"C:\\Desktop",20,300,"No molestar a la gente", "Pepeland",
				"Madrid","Avenida Pepelandia", "demasiado grande", 6000));
		
		List<EventoDTO> edto = adapter.of(eventos);
		
		for(EventoDTO events : edto) {
			if(events.getId() == 2) {
				assertThat(edto).isNotNull();
			}
		}
		
	}
	
	/**
	 * LucaTicketEventossApplicationTests
	 * @author Ioan y Pablo
	 * @version 1.0
	 * 05-12-2022
	 */
	@Test
	void testEventoAltaSuNombre() {
		List<Evento> eventos = repository.findAll();
		eventos.add(new Evento(3,"paco", "ninio","un chaval muy joven",
				"C:\\Documents",50,800,"Molestar a todos", "Nanoland",
				"Madrid","Avenida Nanoland", "demasiado pequenio", 2000));
		
		List<EventoDTO> esdto = adapter.of(eventos);
		
		assertThat(esdto).isEqualTo(eventos);
	}
	
	
}
