package com.lucaticket.compras.controller;

/**
 *EventoNotFoundException
 * @author Martin
 * @since 07-12-2022
 * Se lanza cuando no se encuentra un evento
 */
public class EventoNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public EventoNotFoundException(){
		super("Evento no encontrado");
	}
	
	public EventoNotFoundException(String id) {
		super("Evento con id "+id+" no encontrado");
	}
}
