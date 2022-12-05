package com.lucaticket.eventos.service;

import java.util.List;

import com.lucaticket.eventos.dto.EventoDTO;
import com.lucaticket.eventos.model.Evento;


public interface EventoService {
	public EventoDTO save(Evento e);
	public List<EventoDTO> findAll();
}
