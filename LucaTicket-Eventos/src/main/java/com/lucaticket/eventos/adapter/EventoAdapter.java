package com.lucaticket.eventos.adapter;

import java.util.ArrayList;
import java.util.List;

import com.lucaticket.eventos.dto.EventoDTO;
import com.lucaticket.eventos.model.Evento;
/**
 * EventoAdapter
 * @author Martin
 * Clase que transforma eventos en DTOs de eventos
 * 02-12-2022
 */
public class EventoAdapter {
	public EventoDTO convertToDTO(Evento e) {
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
	
	public List<EventoDTO> convertToDTO(List<Evento> eventos) {
		ArrayList<EventoDTO> todos = new ArrayList<EventoDTO>();
    	for(Evento e : eventos) {
    		todos.add( convertToDTO(e) );
    	}
    	return todos;
	}
}
