package com.lucaticket.eventos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaticket.eventos.adapter.EventoAdapter;
import com.lucaticket.eventos.dto.EventoDTO;
import com.lucaticket.eventos.model.Evento;
import com.lucaticket.eventos.repository.EventoRepository;

@Service
public class EventoServiceImpl implements EventoService {
	@Autowired
	EventoRepository repo;
	/**
	 * save
	 * @param evento que se quiere guardar
	 * @return el evento que se ha guardado, en forma de DTO
	 * @author Martin
	 * 02-12-2022
	 */
	@Override
	public EventoDTO save(Evento e) {
		return (new EventoAdapter()).of( repo.save(e) );
	}
	
	/**
	 * findAll
	 * @return todos los eventos, en forma de DTO
	 * @author Martin
	 * 02-12-2022
	 */
	@Override
	public List<EventoDTO> findAll(){
		return (new EventoAdapter()).of( repo.findAll() );
	}
}
