package com.lucaticket.eventos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaticket.eventos.adapter.EventoAdapter;
import com.lucaticket.eventos.dto.EventoDTO;
import com.lucaticket.eventos.model.Evento;
import com.lucaticket.eventos.repository.EventoRepository;

@Service
public class EventoService {
	@Autowired
	EventoRepository repo;
	/**
	 * EventoDTO
	 * @param evento que se quiere guardar
	 * @return el evento que se ha guardado, en forma de DTO
	 * @author Martin
	 * 02-12-2022
	 */
	public EventoDTO save(Evento e) {
		return (new EventoAdapter()).convertToDTO( repo.save(e) );
	}
}
