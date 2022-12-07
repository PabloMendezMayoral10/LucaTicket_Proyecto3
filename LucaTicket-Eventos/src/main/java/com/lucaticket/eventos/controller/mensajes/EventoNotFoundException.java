package com.lucaticket.eventos.controller.mensajes;

/**
 * EventoNotFoundException
 * @author Martin
 * @since 07-12-2022
 * @apiNote se lanza cuando se busca un evento que no existe
 */
public class EventoNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	public EventoNotFoundException() {
		super("Evento no encontrado");
	}
	public EventoNotFoundException(int id) {
		super("Evento no encontrado: " + id);
	}
}
