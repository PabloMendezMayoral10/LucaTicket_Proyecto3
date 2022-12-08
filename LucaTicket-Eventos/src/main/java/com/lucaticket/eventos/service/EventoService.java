package com.lucaticket.eventos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lucaticket.eventos.controller.mensajes.EventoNotFoundException;
import com.lucaticket.eventos.dto.EventoDTO;
import com.lucaticket.eventos.model.Evento;

@Service
public interface EventoService {
	public EventoDTO save(Evento e);
	
	public List<EventoDTO> findAll();
	
	public EventoDTO findById(String evento) throws EventoNotFoundException;
	


}
