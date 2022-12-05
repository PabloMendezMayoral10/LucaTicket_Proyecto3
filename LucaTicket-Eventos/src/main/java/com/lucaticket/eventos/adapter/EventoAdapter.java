package com.lucaticket.eventos.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.lucaticket.eventos.dto.EventoDTO;
import com.lucaticket.eventos.model.Evento;
/**
 * EventoAdapter
 * @author Martin
 * Clase que transforma eventos en DTOs de eventos
 * 02-12-2022
 */
@Component
public class EventoAdapter {
	public EventoDTO of(Evento e) {
		if(e==null) return null;
		EventoDTO r = new EventoDTO();
        r.setId(e.getId());
        r.setNombre(e.getNombre());
        r.setDescripcioncorta(e.getDescripcioncorta());
        r.setDescripcionlarga(e.getDescripcionlarga());
        r.setRutafoto(e.getRutafoto());
        r.setPreciominimo(e.getPreciominimo());
        r.setPreciomaximo(e.getPreciomaximo());
        r.setNormas(e.getNormas());
        r.setNombrerecinto(e.getNombrerecinto());
        r.setCiudad(e.getCiudad());
        r.setDireccion(e.getDireccion());
        r.setTiporecinto(e.getTiporecinto());
        r.setAforo(e.getAforo());
        return r;
	}
	
	public List<EventoDTO> of(List<Evento> eventos) {
		ArrayList<EventoDTO> todos = new ArrayList<EventoDTO>();
    	for(Evento e : eventos) {
    		todos.add( of(e) );
    	}
    	return todos;
	}
}
