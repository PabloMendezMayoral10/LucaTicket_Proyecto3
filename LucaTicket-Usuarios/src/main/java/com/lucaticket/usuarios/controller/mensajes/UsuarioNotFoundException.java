package com.lucaticket.usuarios.controller.mensajes;

/**
 * UsuarioNotFoundException
 * @author Martin
 * @since 07-12-2022
 * @apiNote se lanza cuando se busca un usuario que no existe
 */
public class UsuarioNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	public UsuarioNotFoundException() {
		super("Usuario no encontrado");
	}
	public UsuarioNotFoundException(int id) {
		super("Usuario no encontrado: " + id);
	}
}
